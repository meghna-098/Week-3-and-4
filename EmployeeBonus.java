// Import Scanner class for user input
import java.util.Scanner;

// Creating class EmployeeBonus to calculate bonus
class EmployeeBonus {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double salary;
        int yearsOfService;
        double bonus = 0;

        // Take input from user
        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100; // 5% bonus
        } else {
            bonus = 0; // No bonus
        }

        // Display bonus
        System.out.println("The bonus amount is: " + bonus);

        // Close scanner
        input.close();
    }
}