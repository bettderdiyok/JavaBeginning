package OOPExamples;
public class BankAccount {
    private String name;
    private int personalAccountNo;
    private double balance;
    private  static double allAccountBalance;
    public static int accountNumber = 0;
    public static int operationNumber = 0;


    public BankAccount(String name, int accountNo, double balance) {
        this.name = name;
        this.personalAccountNo = accountNo;
        this.balance = balance;
        allAccountBalance += balance;
        accountNumber++;

    }

    public int getPersonalAccountNo() {
        return personalAccountNo;
    }

    public void setPersonalAccountNo(int personalAccountNo) {
        this.personalAccountNo = personalAccountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double depositMoney(int amount){
        this.balance += amount;
        operationNumber++;
        allAccountBalance += amount;
        return balance;
    }

    public double withdrawMoney(int amount){
        if(this.balance >= amount ){
            this.balance -= amount;
            allAccountBalance -= amount;
            operationNumber++;
        }else {
            System.out.println("Insufficient balance");
        }


        return balance;
    }

    public static void infoAboutBalance(){
        System.out.println("The number of accounts opened : " + accountNumber);
        System.out.println("Total Money in the bank : " + allAccountBalance);
        System.out.println("Operation number: " + operationNumber);

    }

    public void compareAccount(BankAccount account){
        if(this.getBalance() < account.getBalance()){
            System.out.println(this.name + "'s account has less money than " + account.name + "'s account" );
        }else if(this.getBalance() > account.getBalance()) {
            System.out.println(this.name + "'s account has more money than " + account.name + "'s account" );
        }else {
            System.out.println("Equal");
        }


    }



}
