import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "racecar";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // Step 2: Pop characters from the stack to build the reversed string
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3: Compare original with reversed string
        boolean isPalindrome = input.equals(reversed);

        // Result Output
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}