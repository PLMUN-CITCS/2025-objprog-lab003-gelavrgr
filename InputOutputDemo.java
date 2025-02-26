// File: InputOutputDemo.java
import java.util.Scanner; // Import the Scanner class

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for and input an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for and input a double
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume newline character left in the buffer
        input.nextLine(); // Consume newline

        // Prompt for and input a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output with formatting (Integer)
        System.out.printf("Your integer: %d%n", userInt);

        // Output with formatting (Double)
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output with formatting (String)
        System.out.printf("Your string: %s%n", userString);

        // Close the Scanner
        input.close();
    }
}
