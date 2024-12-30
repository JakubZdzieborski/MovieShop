package threadsHW;

public class MyThreads {
    public static void main(String[] args) {
        //Create and start a thread using Runnable
        Thread thread1 = new Thread(new RunabbleThread());
        // Create and start a thread by extending Thread
        Thread thread2 = new ThreadThread();
        
        //Start both threads
        thread1.start();
        thread2.start();
    }
}