// Import Scanner class for user input
import java.util.Scanner;

// Creating class OddEvenPrinter to print odd and even numbers
class OddEvenPrinter {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable to store user input
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check if current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close scanner
        input.close();
    }
}