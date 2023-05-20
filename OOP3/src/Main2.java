public class Main2 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.price2=456456;
        car.brand2="BMW";

        System.out.println(car.color2);
        System.out.println(car.year);
        System.out.println(car.brand2);


    }
}

class Car2 {
    String color2;
    String brand2;
    int year;
    double price2;
}
