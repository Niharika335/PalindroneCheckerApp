import java.util.Scanner;
import java.util.Stack;

/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 */
public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Inject Stack strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println(result);

        scanner.close();
    }
}

/**
 * ==========================================================
 * INTERFACE - PalindromeStrategy
 * ==========================================================
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ==========================================================
 * CLASS - StackStrategy
 * ==========================================================
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters of input string onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}