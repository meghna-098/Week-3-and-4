// Import Scanner class to take user input
import java.util.Scanner;

// Creating class DivisibleByFive to check divisibility
class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variable to store user input
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check divisibility using modulus operator
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close Scanner
        input.close();
    }
}