package IntroductionOOP;

public class Immutable {
    public static void main(String[] args) {
        String[] manufacturers = {"HP", "Fujitsu", "Dell"};
        Computer comp1 = new Computer(8, 16, manufacturers);

    }
}

class Computer{
    private final int coreNumber;
    private final int ramSize;
    private final String[] manufacturers;

    public Computer(int coreNumber, int ramSize, String[] manufacturers) {
        this.coreNumber = coreNumber;
        this.ramSize = ramSize;
        this.manufacturers = manufacturers;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String[] getManufacturers() {
        return manufacturers;
    }
}
