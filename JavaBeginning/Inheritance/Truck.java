public class Truck extends Vehicle{
    int doorNumber;
    int km;
    int tonnage;
    int length;


    public Truck(){
        this.brand="Dont have name";
        this.model="2022";
        this.color="White";
        this.tyreNumber=4;
        this.doorNumber=4;
        this.km=0;
        this.tonnage=20;
        this.length=5;
    }

    public Truck(String brand, String model){
        this.brand=brand;
        this.model=model;

    }
    public Truck(String brand, String model, String color){
        this(brand, model);
        this.color=color;
        //Bunları yazmazsan da null verir.

    }

    public Truck(String brand, String model, String color, int tyreNumber, int doorNumber, int km, int tonnage, int length){
        this(brand, model, color); //Bu üsttekini çağırır oraya gider.
        this.tyreNumber=tyreNumber;
        this.doorNumber=doorNumber;
        this.km=km;
    }

    public void work(){
        System.out.println("Truck worked");
    }

    public void go(int km){
        System.out.println("Truck went " + km + " km");
        this.km+=km;
    }

    public void horn(){
        System.out.println("DAAARİRİDARİRİDARİRİ");
    }

    public void carryTonnage(int tonnage){
        System.out.println("Truck carried" + tonnage + "tone");

    }

}
