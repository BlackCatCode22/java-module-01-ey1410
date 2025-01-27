import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a single character
        System.out.print("Enter a single character: ");
        char inputChar = scanner.next().charAt(0); // Read the first character input

        // Display the Unicode value of the character
        int unicodeValue = (int) inputChar;
        System.out.println("Unicode value: " + unicodeValue);

        // Check if the character is a letter or a digit
        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is a letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println(inputChar + " is a digit.");
        } else {
            System.out.println(inputChar + " is neither a letter nor a digit.");
        }
        
        scanner.close();
    }
}
