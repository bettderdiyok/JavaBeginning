public class ThreadTypes {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("User Thread", ThreadColors.Green, 5);
        thread1.start();
        System.out.println(thread1.threadId());
        Thread thread2 = new MyThread("Daemon Thread", ThreadColors.Blue, 20);
        thread2.setDaemon(true);
        System.out.println(thread2.threadId());
        thread2.start();


    }
}

class MyThread extends Thread {
    private final String color;
    private int sleepSecond;

    public MyThread(String name, String color, int sleepTime) {
        super(name);
        this.color = color;
        this.sleepSecond = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(color + " I'm starting a process that takes " + sleepSecond + " seconds. Thread name : " + currentThread().getName());
        try {
            Thread.sleep(sleepSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I'm finishing a process that takes 10 seconds.Thread name : " + currentThread().getName());
    }
}