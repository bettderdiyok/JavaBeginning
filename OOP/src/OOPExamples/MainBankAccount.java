package OOPExamples;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount betty = new BankAccount("Betul", 123, 500);
        BankAccount selim = new BankAccount("Selim", 123, 1500);
        BankAccount ayse = new BankAccount("Ayse", 123, 200);
        ayse.depositMoney(500);
        selim.withdrawMoney(450);
        betty.withdrawMoney(600);
        BankAccount.infoAboutBalance();
        betty.compareAccount(selim);


    }
}
