package BankSystem;

public class Main {
    public static void main(String[] args) {
        Customer individualCustomer = new IndividualCustomer("Betty", 34562840);
        Customer corporateCustomer = new CorporateCustomer("Selim", 90877);
        Customer[] customers = new Customer[Customer.objectNumber];
        customers[0] = individualCustomer;
        customers[1] = corporateCustomer;

        for (Customer customer : customers) {
            customer.showCustomerInfo();

        }

        if (individualCustomer instanceof IndividualCustomer) {
            IndividualCustomer newInCustomer = (IndividualCustomer) individualCustomer;
            newInCustomer.applyForCreditCard();

        }
        Customer.printBankName();


    }
}