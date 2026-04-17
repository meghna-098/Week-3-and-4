// Import Scanner class
import java.util.Scanner;

// Creating class LeapYearSingleIf
class LeapYearSingleIf {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable
        int year;

        // Take input from user
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check for valid year and leap year using single if condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is NOT a Leap Year");
        }

        // Close scanner
        input.close();
    }
}