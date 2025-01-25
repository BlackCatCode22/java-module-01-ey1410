import java.util.Scanner;  // Import the Scanner class

public class FavoriteNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.println("Please enter your favorite number:");

        // Read the number input (assuming it’s an integer)
        int favoriteNumber = scanner.nextInt();

        // Print the favorite number back to the user with a message
        System.out.println("Your favorite number is: " + favoriteNumber);


        scanner.close();
    }
}
