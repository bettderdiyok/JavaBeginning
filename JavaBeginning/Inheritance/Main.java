
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehicle c1 = new Car("OPEL", "2020", "RED", 4, 5, 5000);
        Vehicle t1 = new Truck("VOLVO", "2023", "YELLOW", 20, 2, 10000, 50, 10);
        Vehicle b1 = new Bicycle("BIYANCHI", "2022", "RED", 2, 15);
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("BMW", "2021", "PURPLE", 4);

        b1.horn();
        b1.work();
        t1.work();
        c1.work();
        System.out.println(v1.brand);
        System.out.println(v1.tyreNumber);
        System.out.println(v2.brand);
        v1.horn();
        b1.ringBell();
        v1.ringBell();//Override yok

//Bu kodda tek seviyede bir interitancce yaptık



        /*  Car c2 = new Car("TOGG", "2023", "BLUE",4,5, 50000);
        Car c3 = new Car("TESLA", "2022", "RED");
        Car c4 = new Car("OPEL", "2023");
        System.out.println(c2.color);
        System.out.println(c2.brand);
        System.out.println(c3.brand);
        System.out.println(c3.model);
        System.out.println(c3.color);
        System.out.println(c1.brand);
        c1.go(500);
        c1.work();
        System.out.println(c1.km);
        c1.soundTheHorn();
        */












    }
}
