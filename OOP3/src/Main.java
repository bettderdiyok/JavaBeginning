public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand="Tesla";
        car1.yearOfProduction=2020;
        car1.price=5504030;
        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println(car1.brand);
        System.out.println(car1.yearOfProduction);
        System.out.println();
        car2=car1;
        System.out.println(car2.color);
        System.out.println(car2.price);
        System.out.println(car2.brand);
        System.out.println(car2.yearOfProduction);

    }
}