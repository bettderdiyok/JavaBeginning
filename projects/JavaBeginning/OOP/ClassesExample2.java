package OOP2.src;

import java.nio.channels.ByteChannel;

public class Example2 {
    public static void main(String[] args) {
      Bicycle b1 = new Bicycle(50);
      Bicycle b2 = new Bicycle(20,100 );
      Bicycle b3 = new Bicycle(10, 2, 120);
    /*  Bicycle b4 = new Bicycle(); bunu yapamayız. Constructor yazılmamışsa bu şekilde obje oluşturabiliyoruz.
    Sıfır argümanlı contructor oluyor.Bunu yazıp herhangi bir constructor da yazarsan bunu saymaz devre dışı bırakır.hem Constructor hem de  bunu yazmak isytiyorsak  aşağıdaki gibi yaparız.
*/
        Bicycle b4 = new Bicycle();
       /* System.out.println(b4.speed);
        System.out.println(b3.speed);
        System.out.println(b2.speed);
        System.out.println(b2.gear);
        System.out.println(b1.speed);
       // System.out.println(b4.speed);
        System.out.println();

        b1.speed = 10;
        b1.changeSpeed(50);
        b1.increaseGear();
        b1.showSpeed();

*/
    }
}

class Bicycle {
    int speed;
    int weight;
    int gear;

   /* public Bicycle(){

    }
     Bicycle b4 = new Bicycle(); yaptığımızda bu kısım default olarak var ama biz görmüyoruz.

    */
 public Bicycle(){
    this.speed = 0;
    this.weight = 0;
    this.gear = 0;
     System.out.println("hello");

 }
    public Bicycle(int a){
     this.speed = 0;
     this.gear = 1;
     this.weight = a;
    }

    public Bicycle(int a, int b){
        this.speed = a;
        this.gear = 1;
        this.weight = b;
    }

    public Bicycle(int a, int b, int c){
        this.speed = a;
        this.gear =  b;
        this.weight = c;
    }

    public void changeSpeed(int newSpeed){
        this.speed = newSpeed;

    }

    public void increaseGear (){
        this.gear++;
    }
    public void decreaseGear (){
        this.gear--;
    }

    public void showSpeed(){
        System.out.println("Speed = " + speed);
        System.out.println("Gear = " + gear);
    }

}
