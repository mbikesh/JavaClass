public class BankAccountMain {
    public static void main(String[] args) {


        BankAccount account=new BankAccount("First");
        account.displayInfo();
        account.depositFunds(2000);
        account.withdraw(23);
        account.withdraw(54,23);
        account.depositFunds(400,4);
        account.previousTransaction();
        System.out.println();

        BankAccount account1=new BankAccount("Second",2000);
        account1.displayInfo();

    }
}
