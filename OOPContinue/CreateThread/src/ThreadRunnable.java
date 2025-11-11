public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Thread2 : " + Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread2 is running " +  Thread.currentThread().getName());


    }
}
