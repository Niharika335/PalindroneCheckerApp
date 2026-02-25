public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;
        int n = word.length();

        // Loop only until the halfway point
        for (int i = 0; i < n / 2; i++) {
            // Compare character at start with character at symmetric end
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Displaying the result
        System.out.println("String: " + word);
        System.out.println("Is a palindrome?: " + isPalindrome);
    }
}