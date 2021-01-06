public class BankAccount {

    private int balance;

    private String name;

    private int  accountNumber=123456;
    private int initialBalance;
    private int previousTransaction;

    public BankAccount(String name){
        this.name=name;
        this.initialBalance=0;

    }
    public BankAccount(String name,int balance){
        this.name=name;
        this.balance=balance;

    }


    public void depositFunds(int depositAmount) {
        if (depositAmount != 0) {
            this.balance += depositAmount;
        }
        previousTransaction=this.balance;
            displayInfo();
        System.out.println();
    }
    public void depositFunds(int depositAmount,int years){
        if(depositAmount!=0){
            this.balance+=depositAmount;
            previousTransaction=depositAmount;
        }

        double rate=2.2;
        double totalBalance=((rate*this.balance*years)/100)+this.balance;
        System.out.println("Amount deposited is: $"+depositAmount+" and total balance after " + years+"years is: $"+totalBalance);

      displayInfo();
        System.out.println();
    }
    public void withdraw(int withdrawAmount){
        if(withdrawAmount!=0){
            this.balance-=withdrawAmount;
        }
        previousTransaction=-withdrawAmount;
         displayInfo();
        System.out.println();
    }

    public void withdraw(int withdrawAmount,int fees){
        if(withdrawAmount!=0){
            this.balance=this.balance-(withdrawAmount+fees);
            previousTransaction=-withdrawAmount;
        }
        System.out.println("Withdraw amount is: $"+withdrawAmount+" and withdrawal fee is: -$"+fees);
      displayInfo();
        System.out.println();
    }


    public void displayInfo(){
        System.out.println("Account number is: "+accountNumber);
        System.out.println("Balance is: $"+this.balance);

    }
    public void previousTransaction(){
        if(previousTransaction!=0){

            System.out.println("Previous transaction is: "+previousTransaction);


        }

    }


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
