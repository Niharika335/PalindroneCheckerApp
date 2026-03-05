import java.util.Stack;

/**
 * PalindromeChecker encapsulates the logic for string symmetry validation.
 * It adheres to the Single Responsibility Principle.
 */
public class PalindromeChecker {

    /**
     * Public method to check if a string is a palindrome.
     * Normalizes the input before processing.
     */
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String cleanStr = preprocess(input);
        return isStackMatch(cleanStr);
    }

    /**
     * Private helper to handle normalization (Encapsulation).
     */
    private String preprocess(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    /**
     * Internal logic using a Stack data structure.
     */
    private boolean isStackMatch(String str) {
        Stack<Character> stack = new Stack<>();
        int len = str.length();

        // 1. Push all characters onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // 2. Pop characters and compare with the original string order
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
