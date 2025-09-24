public /* abstract*/ class Vehicle {
    String brand;
    String model;
    String color;
    int tyreNumber;

    public Vehicle(){
        this.brand="No";
        this.model="No";
        this.color="No";
        this.tyreNumber=0;
        //Argümansız Constructor, sıfır argümanlı constructor
    }

    public Vehicle(String brand, String model, String color, int tyreNumber){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.tyreNumber=tyreNumber;
    }



    public void horn() {
        System.out.println("Vehicle is horning");

    }

    public void work(){
        System.out.println("Vehicle worked");
    }
public void ringBell(){
    System.out.println("The bell is ringing");
}


}
