import java.util.Scanner;

class Bank {
    String name;
    int accno;
    double principal;

    public Bank(String name, int accno, double principal) {
        this.name = name;
        this.accno = accno;
        this.principal = principal;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: $" + principal);
    }
}

class Account extends Bank {
    public Account(String name, int accno, double principal) {
        super(name, accno, principal);
    }

    public void deposit(double amt) {
        principal += amt;
    }

    public void withdraw(double amt) {
        if (amt > principal) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            principal -= amt;
            if (principal < 500) {
                double penalty = (500 - principal) / 10;
                principal -= penalty;
            }
        }
    }
}

public class Main_Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter account number: ");
        int accno = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter principal amount: $");
        double principal = input.nextDouble();
        input.nextLine(); 

        Account account = new Account(name, accno, principal);

        System.out.println("Initial Details:");
        account.display();

        System.out.print("Enter transaction amount: $");
        double transactionAmount = input.nextDouble();
        input.nextLine(); 

        account.deposit(transactionAmount);
        System.out.println("After Deposit:");
        account.display();

        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = input.nextDouble();
        input.nextLine();
       
        account.withdraw(withdrawalAmount);
        System.out.println("After Withdraw:");
        account.display();

        input.close();
    }
}
