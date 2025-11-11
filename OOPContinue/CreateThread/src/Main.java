public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new ThreadExtendClass();
        thread1.setName("THREAD 1");
        thread1.start();
        Thread thread2 = new Thread(new ThreadRunnable());
        thread2.start();

        /*
        start() → yeni thread oluşturur ve run() metodunu bu thread içinde çalıştırır.
        run() → doğrudan çağırırsan yeni thread oluşmaz, sadece mevcut thread’de çalışır.
         */
        System.out.println("The program is finished.");
    }
}
