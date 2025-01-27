import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user for the rate of interest
        System.out.print("Enter the rate of interest (as a percentage): ");
        double rate = scanner.nextDouble();

        // Ask the user for the time period (in years)
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest using the formula:
        // Simple Interest = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.printf("The simple interest is: %.2f\n", simpleInterest);

        scanner.close();
    }
}
