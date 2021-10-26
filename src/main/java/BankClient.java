import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        System.out.println("Hi, "+name+"! What command would you like to carry out? (withdraw/deposit/check balance/check account number/set preferred name/print summary)");
        String command = scan.nextLine();
        BankAccount account = new BankAccount(0,101134, name);
        if(command.equals("withdraw")){
            System.out.println("How much money would you like to withdraw?");
            int howmuch = scan.nextInt();
            account.withdraw(howmuch);
        }
        else if(command.equals("summary") ){
            System.out.println(account);
        }
        // Create a bank account with the given name and the account number 101134
//        BankAccount account = new BankAccount(name, 101134);
    }
}
