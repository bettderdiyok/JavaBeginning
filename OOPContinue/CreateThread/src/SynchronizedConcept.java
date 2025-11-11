public class SynchronizedConcept {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();   // <- iş parçacıklarını bekle
        t2.join();
        System.out.println("Final count : " + counter.getCount());
    }
}

class Counter {
    private int count = 0;
    public synchronized void increment(){
        count ++;
    }

    //increment()’a aynı anda yalnızca bir thread girebilir.
    public synchronized int getCount() {
        return count;
    }
}
