//simple greeting
//https://www.w3schools.com/java/java_user_input.asp


import java.util.Scanner;  // Import the Scanner class

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to Simple Greeting!\n\n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // create string variable to hold our users name
        String myUserName;

        // Output user input
        System.out.println("\n Please enter your name:");

        // get the input into our variable
        myUserName = scanner.nextLine();

        //prove that you got user name.
        System.out.println("\n Hello" + myUserName + " how are you today?");
    }
}