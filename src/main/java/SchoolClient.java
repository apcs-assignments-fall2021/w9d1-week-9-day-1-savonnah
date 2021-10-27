import java.util.Scanner;

public class SchoolClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        System.out.println("Hi, "+name+"! What command would you like to carry out? (input grade/deposit/withdraw/check balance/check student ID number/check student grade/set preferred name/print summary)");
        String command = scan.nextLine();
        School account = new School(11,14312938, 0, name);
        if(command.equals("withdraw")){
            System.out.println("How much money would you like to withdraw?");
            int howmuch = scan.nextInt();
            account.withdraw(howmuch);
        }
        else if(command.equals("deposit")){
            System.out.println("How much money would you like to deposit?");
            int howmuch1 = scan.nextInt();
            account.deposit(howmuch1);
        }
        else if(command.equals("input grade")){
            System.out.println("Please input your grade.");
            int grade = scan.nextInt();
            account.inputgrade(grade);
        }
        else if(command.equals("check student grade")){
            System.out.println("Student is in grade: "+ account.getgrade());
        }
        else if(command.equals("check student ID number")){
            System.out.println("Account number: "+ account.getSchoolID());
        }
        else if(command.equals("check balance")){
            System.out.println("Current lunch balance: "+ account.getBalance());
        }
        else if(command.equals("set preferred name")){
            System.out.println("What would you like your preferred name to be?");
            String newname = scan.nextLine();
            System.out.println("Name changed successfully to: " + account.getSchoolName(newname));
        }
        else if(command.equals("print summary") ){
            System.out.println(account);
        }
        // Create a bank account with the given name and the account number 101134
//        BankAccount account = new BankAccount(name, 101134);
    }
}
