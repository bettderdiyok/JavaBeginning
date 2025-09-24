package OOP;

public class NewCar {
    String color;
    String brand;
    double price;
    int yearOfProduction;

    NewCar(String color, String brand, double price, int yearOfProduction) {
     this.color=color;
     this.brand=brand;
     this.price=price;
     this.yearOfProduction=yearOfProduction;
    }

    public void sayBrand(){
        System.out.println("My brand is " + brand);
    }

    public void sayPrice(){
        System.out.println("My price is " + price);
    }



}
