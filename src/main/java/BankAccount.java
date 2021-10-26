public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;


    public BankAccount (int b, int a, String p){
        balance = b;
        accountNumber = a;
        preferredName = p;
    }

    public void Account (){
        this.balance = 0;
    }

    public void deposit (int input){
        this.balance = balance + input;
    }

    public void withdraw (int input){
        this.balance = balance - input;
    }

    public void getAccountname (String name){
        this.preferredName = name;
    }

    public int getBalance (){
        return balance;
    }

    public int getAccountnum(){
        return (101134);
    }

    @Override
    public String toString() {return "Account" +  this.accountNumber + "has a balance of: " + this.balance;}


}