import com.sun.security.jgss.GSSUtil;

import javax.swing.plaf.TableHeaderUI;

public class VehicleExample {
    public static void main(String[] args) {
        // 1)Subclass Referance
        Car car = new Car();
        car.move(); //override
        car.openAirConditioner();//special method

        // 2)Superclass Referance
        Vehicle car2 = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle bus = new Bus();

        car2.move();
        bicycle.move();
        bus.move();
        System.out.println();
        Vehicle[] vehicles = {new Car(), new Bicycle(), new Bus()};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();

        }

    }
}

class Vehicle {
    public void move(){
        System.out.println("The vehicle is moving...");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is on the road");
    }

    public void openAirConditioner(){
        System.out.println("The car's air conditioner is now on");
    }
}


class Bicycle extends  Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is on the road");
    }

    public void ringBell() {
        System.out.println("The bicycle bell is ringing!");
    }
}

class Bus extends  Vehicle {
    @Override
    public void move() {
        System.out.println("The bus is on the road");
    }


}
/*
Açıklama

Alt sınıf referansı (Car car = new Car();)
→ Hem move() metoduna hem de Car’a özel openAirConditioner() metoduna erişebilirsin.

Üst sınıf referansı (Vehicle v1 = new Car();)
→ Sadece Vehicle metodlarını görebilirsin (move()),
ama çalışma zamanında gerçek nesneye göre (Car, Bicycle, Bus) farklı davranış çıkar.

Polymorphism avantajı (Vehicle[] listesi)
→ Tek bir listede farklı araç türlerini topladık, move() çağırınca hepsi kendi hareketini yaptı.
 */