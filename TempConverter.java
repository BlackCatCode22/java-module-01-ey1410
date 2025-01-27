import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result with formatted output
        System.out.printf("%.2f°F is equal to %.2f°C\n", fahrenheit, celsius);


        scanner.close();
    }
}
