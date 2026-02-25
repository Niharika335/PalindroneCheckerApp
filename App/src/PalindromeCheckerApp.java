public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "kayak";

        // Initial call to the recursive method
        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("String: " + input);
        System.out.println("Is Palindrome: " + result);
    }

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String s, int start, int end) {
        // Base Condition 1: If pointers meet or cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters don't match, it's NOT a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Check the inner substring by moving pointers inward
        return isPalindrome(s, start + 1, end - 1);
    }
}