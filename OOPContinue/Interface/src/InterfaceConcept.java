public class InterfaceConcept {
    public static void main(String[] args) {
        Switchable lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOff();

    }
}

interface  Switchable {
    void turnOn();
    void turnOff();
}

class Lamp implements  Switchable {

    @Override
    public void turnOn() {
        System.out.println("The lamp has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The lamp has been turned off");

    }
}

class Television implements  Switchable {


    @Override
    public void turnOn() {
        System.out.println("The television has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The television has been turned off");
    }
}




