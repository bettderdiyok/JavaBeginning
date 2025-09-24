package BankSystem;

public class Customer {
    private String name;
    private int idNumber;
     static int objectNumber = 0;

    public Customer(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        objectNumber ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void showCustomerInfo(){
        System.out.println("\nCustomer's name : " + getName() + "\nCustomer's ID : " + getIdNumber());
    }

    public static void printBankName(){
        System.out.println("Welcome to JBank" );
    }
}
