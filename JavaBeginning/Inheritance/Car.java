public class Car extends Vehicle {
    int doorNumber;
    int km;

    public Car(){
        this.brand="Dont have name";
        this.model="2022";
        this.color="White";
        this.tyreNumber=4;
        this.doorNumber=4;
        this.km=0;
    }

    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;

    }
    public Car(String brand, String model, String color){
        this(brand, model);
        this.color=color;
        //Bunları yazmazsan da null verir.


    }


    public Car(String brand, String model, String color, int tyreNumber, int doorNumber, int km){
    this(brand, model, color); //Bu üsttekini çağırır oraya gider.
    this.tyreNumber=tyreNumber;
    this.doorNumber=doorNumber;
    this.km=km;
    }

    public void work(){
        System.out.println("Car worked");
    }

    public void go(int km){
        System.out.println("Car went " + km + " km");
        this.km+=km;

    }

    public void horn(){
        System.out.println("DÜÜÜÜÜÜÜÜÜÜÜTTTT");
    }
}
