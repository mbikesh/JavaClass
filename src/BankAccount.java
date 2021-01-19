public class BankAccount {

    private int balance;

    private String name;

    static int  accountNumber=1234;
    private int initialBalance;
    private int previousTransaction;

    public BankAccount(String name){
        this.name=name;
        this.initialBalance=0;
        accountNumber++;
    }
    public BankAccount(String name,int balance){
        this.name=name;
        this.balance=balance;
        accountNumber++;
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

  
}
