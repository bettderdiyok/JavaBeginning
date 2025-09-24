public class Bicycle extends Vehicle {
    int weight;

    public Bicycle(){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.tyreNumber=2;
        this.weight=10;

    }


    public Bicycle(String brand, String model){
        this.brand=brand;
        this.model=model;

    }
    public Bicycle(String brand, String model, String color){
        this(brand, model);
        this.color=color;
        //Bunları yazmazsan da null verir.

    }

    public Bicycle(String brand, String model, String color, int tyreNumber, int weight){
        this(brand, model, color); //Bu üsttekini çağırır oraya gider.
        this.weight=weight;
        this.tyreNumber=tyreNumber;

    }
    public void horn(){
        System.out.println("ZIIIIIIIRRRRR");
    }

}
