import java.util.Scanner;

public class bankaccount {
    private int accnumber;
    private double accbalance;

    public bankaccount(int number, double balance) {
        this.accnumber = number;
        this.accbalance = balance;
    }

    public bankaccount(int number) {
        this(number, 0.0);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accnumber);
        System.out.println("Balance: Rs" + accbalance);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            bankaccount account1 = new bankaccount(accountNumber, initialBalance);

            System.out.print("Enter another account number: ");
            int accountNumber2 = scanner.nextInt();
            System.out.print("Enter initial balance: ");
            double initialBalance2 = scanner.nextDouble();
            bankaccount account2 = new bankaccount(accountNumber2, initialBalance2);

            account1.displayAccountInfo();
            account2.displayAccountInfo();
        }
    }
}
