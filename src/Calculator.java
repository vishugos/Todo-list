import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations){
            System.out.println("Welcome to My Calculator!");

            System.out.println("1 - Addition");
            System.out.println("2 - Multiplication");
            System.out.println("3 - Division");
            System.out.println("4 - Subtraction");

            System.out.print("Please enter the first value: ");
            double n1 = sc.nextDouble();

            System.out.print("Enter the second value: ");
            double n2 = sc.nextDouble();

            System.out.print("Enter the operator (1-4): ");
            int operator = sc.nextInt();


            double result = 0;
            boolean validInput = true;

            switch (operator) {
                case 1:
                    result = n1 + n2;
                    break;

                case 2:
                    result = n1 * n2;
                    break;

                case 3:
                    if (n2 != 0) {
                        result = n1 / n2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validInput = false;
                    }
                    break;

                case 4:
                    result = n1 - n2;
                    break;

                default:
                    System.out.println("Invalid input! Please enter a valid operator (1-4).");
                    validInput = false;
            }

            if (validInput) {
                System.out.println("The result is: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            sc.nextLine(); // Consume the newline character
            String choice = sc.nextLine().trim().toLowerCase();

            if (!choice.equals("yes")) {
                continueCalculations = false;
                System.out.println("Thank you for using My Calculator! Goodbye!");
            }

        }
    }
}
