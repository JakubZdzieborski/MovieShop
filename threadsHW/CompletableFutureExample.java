package threadsHW;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance(5);
        ExecutorService executor = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 7; i++) {
            CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " trying to acquire a connection...");
                    Connection connection = pool.getConnection();
                    System.out.println(Thread.currentThread().getName() + " acquired connection: " + connection.getId());
                    Thread.sleep(3000); //Simulate work with the connection
                    pool.releaseConnection(connection);
                    System.out.println(Thread.currentThread().getName() + " released connection: " + connection.getId());
                    return connection;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, executor);
        }

        executor.shutdown();
    }
}