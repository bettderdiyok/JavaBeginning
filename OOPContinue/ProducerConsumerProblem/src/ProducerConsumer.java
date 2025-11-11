public class ProducerConsumer {
    public static void main(String[] args) {
        FreeField freeField = new FreeField();
        Producer producer = new Producer(freeField);
        Consumer consumer = new Consumer(freeField);
        producer.start();
        consumer.start();

    }
}

class FreeField {
    private int data;
    private boolean hasData = false;
    public synchronized int  takeData(){
        while(!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = false;
        notifyAll();
        return data;
    }
    public synchronized void printData(int data) {
        while(hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.data = data;
        hasData = true;
        notifyAll();
        System.out.println("Data : " + data);
    }
}


class Producer extends Thread {
    private FreeField freeField;
    public Producer (FreeField f){
        this.freeField = f;
    }
    @Override
    public void run() {
       for (int i=1; i<=10; i++) {
           freeField.printData(i);
           try {
               sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}

class Consumer extends Thread {
    private FreeField freeField;

    public Consumer(FreeField freeField) {
        this.freeField = freeField;
    }

    @Override
    public void run() {
        int readData = 0;
        for (int i=1; i<=10; i++) {
            readData = freeField.takeData();
            System.out.println("Consumer data : " + readData);
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

