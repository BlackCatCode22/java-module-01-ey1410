import java.util.Scanner;  // Import the Scanner class

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Please enter the radius of the circle:");

        // Read the radius input (assuming it's a floating-point number)
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: Area = π * r^2
        double area = Math.PI * radius * radius;

        // Output the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        
        scanner.close();
    }
}
