import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform and display addition
        double sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Perform and display subtraction
        double difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Perform and display multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Perform and display division (check for division by zero)
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }
}
