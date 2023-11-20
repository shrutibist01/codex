
import java.util.Scanner;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter another integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter a double (c): ");
        double c = scanner.nextDouble();

        int result1 = mathOps.add(a, b);
        System.out.println("Result of adding two integers: " + result1);

        double result2 = mathOps.add(c, c);
        System.out.println("Result of adding two doubles: " + result2);

        double result3 = mathOps.add(a, c);
        System.out.println("Result of adding an integer and a double: " + result3);

        scanner.close();
    }
}
