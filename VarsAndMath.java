public class VarsAndMath {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double price = 19.99;
        char grade = 'A';

        int sum = num1 + num2;
        int difference = num1 - num2;
        double totalPrice = price * 2;

        String message = "The sum of " + num1 + " and " + num2 + " is: " + sum;
        String priceMessage = "The total price for two items is: $" + totalPrice;

        System.out.println(message);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println(priceMessage);
        System.out.println("The grade you received is: " + grade);
    }
}
