// Import Scanner class for user input
import java.util.Scanner;

// Creating class MultiplicationTable to print table from 6 to 9
class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {

            // Print in required format
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close scanner
        input.close();
    }
}