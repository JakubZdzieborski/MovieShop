package threadsHW;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionPoolApp {
    public static void main(String[] args) {
        //Initialize the connection pool with 5 connections
        ConnectionPool pool = ConnectionPool.getInstance(5);

        //Create a thread pool with 7 threads
        ExecutorService executor = Executors.newFixedThreadPool(7);

        //Task to simulate acquiring and releasing a connection
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " trying to acquire a connection...");
                Connection connection = pool.getConnection(); // Acquire a connection
                System.out.println(Thread.currentThread().getName() + " acquired connection: " + connection.getId());
                Thread.sleep(3000); //Simulate work with the connection
                pool.releaseConnection(connection); //Release the connection
                System.out.println(Thread.currentThread().getName() + " released connection: " + connection.getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //Submit 7 tasks to the executor
        for (int i = 0; i < 7; i++) {
            executor.submit(task);
        }

        //Shutdown the executor after all tasks are submitted
        executor.shutdown();
    }
}

