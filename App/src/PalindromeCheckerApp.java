import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "radar";

        // ArrayDeque is more efficient than Stack or LinkedList for this purpose
        Deque<Character> deque = new ArrayDeque<>();

        // Fill the Deque with characters from the string
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare from both ends until 0 or 1 character remains
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}