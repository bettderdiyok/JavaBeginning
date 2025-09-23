public class Constructors {
    public static void main(String[] args) {
     Car car1=new Car("BMW", "Blue", 6500000, 2022);
        System.out.println(car1.price);
        Car car2= new Car("TOYOTA", "Pınk",450000 , 2020 );
        System.out.println(car2.price);
    }
}
 class Car {
     String brand;
     String color;

     double price;
     int yearOfProduction;

     Car(String brand, String color, int price, int yearOfProduction) {
         //Bu metoda constructor denir. Buraya gönderdiğimiz Marka olan bmw c değişkenine atanacak ve diğerleri de aynı şekilde
         this.brand = brand;
         this.color = color;
         this.price = price;
         this.yearOfProduction = yearOfProduction;
     }
 }

