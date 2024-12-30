package threadsHW;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ConnectionPool {
    private static ConnectionPool instance; //Singleton instance of ConnectionPool
    private final BlockingQueue<Connection> pool; //Thread-safe queue to hold connections

    //Private constructor for initializing the pool with a fixed size
    private ConnectionPool(int size) {
        pool = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            pool.offer(new Connection(i + 1)); // Add mock connections to the pool
        }
    }

    //Lazy initialization: Create the pool instance only when needed
    public static synchronized ConnectionPool getInstance(int size) {
        if (instance == null) {
            instance = new ConnectionPool(size);
        }
        return instance;
    }

    //Method to acquire a connection from the pool
    public Connection getConnection() throws InterruptedException {
        return pool.take(); // Waits if no connection is available
    }

    //Method to release a connection back to the pool
    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }
}