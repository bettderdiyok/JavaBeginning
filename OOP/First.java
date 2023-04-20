package OOP;

public class First {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.color="Blue";
        car1.brand="TOGG";
        car1.yearOfProduction=2023;
        car1.price=950000;

        car2.color="White";
        car2.yearOfProduction=2020;
        car2.brand="FIAT";

        car3.price=950000;

        System.out.println("The brand of the car="+car1.brand);
        System.out.println("The price of the car="+car1.price);
        System.out.println("The color of the car="+car1.color);

        car1.go();
        car1.stop();

        car1.whatBrand();
        car2.whatBrand();

        System.out.println(car1.brand);
        System.out.println(car2.brand);

        car1=car2;
        System.out.println(car1.brand);

    }
}

