// Import Scanner class for user input
import java.util.Scanner;

// Creating class LeapYearChecker
class LeapYearChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable
        int year;

        // Take input from user
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check if year is valid (Gregorian calendar)
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582");
        } else {

            // ----------- Method 1: Using multiple if-else -----------
            if (year % 400 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Using if-else: Year is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            } else {
                System.out.println("Using if-else: Year is NOT a Leap Year");
            }

            // ----------- Method 2: Using single if with logical operators -----------
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println("Using single if: Year is a Leap Year");
            } else {
                System.out.println("Using single if: Year is NOT a Leap Year");
            }
        }

        // Close scanner
        input.close();
    }
}