// Import Scanner class for user input
import java.util.Scanner;

// Creating class PrimeNumberChecker
class PrimeNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Assume number is prime initially
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {

            // Loop from 2 to number - 1
            for (int i = 2; i < number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisible
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println("The number " + number + " is a Prime Number");
        } else {
            System.out.println("The number " + number + " is NOT a Prime Number");
        }

        // Close scanner
        input.close();
    }
}