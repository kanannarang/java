import java.util.ArrayList;
import java.util.Scanner;
class Transaction{
    String type;
    double amount;

    Transaction(String type, double amount){
        this.type = type;
        this.amount= amount;
    }
     public String toString() {
        return type + ": Rs. " + amount;
     }
}
class  Account {
   private String name;
    private int accountNumber;
    private double balance;
    ArrayList<Transaction>transactions= new ArrayList<>();

    public Account(String name,int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance= balance;

    }
    public void Deposit(double amount){
        if(amount>0) {
            balance += amount;
            transactions.add(new Transaction("Deposit" , amount));
            System.out.println("Deposited successfully");
        }
       
    }
    public void Withdraw (double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawn successfully");
        }
            else {
                System.out.println("Insufficient balance or invalid amount");
            }
        }
        public void viewTransaction() {
            if(transactions.isEmpty()) {
                System.out.println();
             }
              else {
                    for(Transaction t : transactions) {
                        System.out.println(t);
                    }
                }

        }
       
        public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    } 
}

public class BankApp {
     static Scanner sc = new Scanner(System.in);
        static Account account;
        public static void main(String[] args) {
                    System.out.print("Enter account holder name: ");
                   String name = sc.nextLine();
            account=new Account(name, 47267, 0);
         System.out.println("Account created successfully. Account Number: " );
    
            int choice;
            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.Deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.Withdraw(with);
                        break;
                    case 3:
                        account.checkBalance();
                    break;
                case 4:
                    account.viewTransaction();
                     break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }

}
