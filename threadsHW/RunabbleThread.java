package threadsHW;

public class RunabbleThread implements Runnable {
    @Override
    public void run() {
        //This method will be executed when the thread starts
        System.out.println("Thread using Runnable is running: " + Thread.currentThread().getName());
    }
}