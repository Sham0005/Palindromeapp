/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * @author Developer
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input
        String input = "level";

        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome ");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ");
        }
    }
}