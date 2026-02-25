public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String input = "deified";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer initialization
        int start = 0;
        int end = charArray.length - 1;

        // Move pointers toward each other
        while (start < end) {
            // Compare characters at the current pointer positions
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Mismatch found, exit immediately
            }

            // Increment start and decrement end
            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}