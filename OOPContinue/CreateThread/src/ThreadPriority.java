import java.awt.geom.Point2D;

public class ThreadPriority {
    public static void main(String[] args) {
        OddNumber  t1 = new OddNumber("1");
        OddNumber  t2 = new OddNumber("2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();



    }
}

class OddNumber extends Thread {
    String name;
    String color;
    public OddNumber(String name) {
        super(name);
        this.name = name;
        if(name.equals("1")) {
            color = ThreadColors.Cyan;
        } else {
            color = ThreadColors.Red;
        }

    }
    @Override
    public void run() {
       for(int i=0; i<100; i++) {
           if(i % 2 != 0) {
               System.out.println(color + i);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
    }
}
