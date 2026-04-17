// Import Scanner class for user input
import java.util.Scanner;

// Creating class SmallestChecker to check if first number is smallest
class SmallestChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number1, number2, number3;

        // Take inputs from user
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 <= number2) && (number1 <= number3);

        // Display result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close scanner
        input.close();
    }
}