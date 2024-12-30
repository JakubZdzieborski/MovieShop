package threadsHW;

class ThreadThread extends Thread {
    @Override
    public void run() {
        //This method will be executed when the thread starts
        System.out.println("Thread using Thread is running: " + Thread.currentThread().getName());
    }
}