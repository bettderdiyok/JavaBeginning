package BankSystem;

public class IndividualCustomer extends Customer {

    public IndividualCustomer(String name, int idNumber) {
        super(name, idNumber);
    }

    @Override
    public void showCustomerInfo() {
        System.out.println( "IndividualCustomer name : " + getName() + "\nID Number : " + getIdNumber());

    }

    public void applyForCreditCard(){
        System.out.println("Your credit card application is being processed. ");
    }
}
