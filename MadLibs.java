import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a series of words
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String secondNoun = scanner.nextLine();

        // Construct the story using string concatenation
        String story = "Once upon a time, there was a " + adjective + " " + noun + ". It decided to " + verb + " to the " + secondNoun + " to have an adventure.";

        // Display the result
        System.out.println("\nHere is your Mad Lib story:\n");
        System.out.println(story);

        
        scanner.close();
    }
}
