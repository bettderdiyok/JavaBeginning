package BankSystem;

public class CorporateCustomer extends  Customer {
    public CorporateCustomer(String name, int idNumber) {
        super(name, idNumber);
    }

    @Override
    public void showCustomerInfo() {
        super.showCustomerInfo();
    }

    public void approveLoan(){
        System.out.println("Your loan application has been approved.");
    }
}
