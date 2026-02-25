import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "racecar";

        // Initialize structures
        Queue<Character> queue = new LinkedList<>(); // Queue uses LinkedList in Java
        Stack<Character> stack = new Stack<>();

        // Fill both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);  // Enqueue (FIFO)
            stack.push(c); // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare Dequeue (Front) with Pop (Top)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue returns first char added
            char fromStack = stack.pop();    // Pop returns last char added

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        System.out.println("String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}