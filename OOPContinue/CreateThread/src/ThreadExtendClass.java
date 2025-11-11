public class ThreadExtendClass extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread1 : " + Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread1 is running " +  Thread.currentThread().getName());
        System.out.println("hy");
    }
}
