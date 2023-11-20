import java.util.Scanner;

class Worker {
    String name;
    double basic;

    public Worker(String name, double basic) {
        this.name = name;
        this.basic = basic;
    }

    void display() {
        System.out.println("Worker Name: " + name);
        System.out.println("Basic Pay: " + basic);
    }
}

class Wages extends Worker {
    double hrs;
    double rate;
    double wage;

    public Wages(String name, double basic, double hrs, double rate) {
        super(name, basic);
        this.hrs = hrs;
        this.rate = rate;
    }

    double overtime() {
        double overtimeHours = Math.max(0, hrs - 40);
        return overtimeHours * rate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hrs);
        System.out.println("Rate per Hour: " + rate);
        double overtimeAmount = overtime();
        wage = basic + overtimeAmount;
        System.out.println("Overtime Amount: " + overtimeAmount);
        System.out.println("Monthly Wage: " + wage);
    }
}

public class Workerwage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Worker Name: ");
        String name = input.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basic = input.nextDouble();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter Rate per Hour: ");
        double ratePerHour = input.nextDouble();

        Wages wages = new Wages(name, basic, hoursWorked, ratePerHour);
        wages.display();

        input.close();
    }
}