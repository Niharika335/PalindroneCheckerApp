public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string literal
        String original = "madam";
        String reversed = "";

        // Iterate from the last character (length - 1) to the first (0)
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Building the reversed string
            reversed = reversed + original.charAt(i);
        }

        // Compare content using .equals()
        boolean isPalindrome = original.equals(reversed);

        // Display results
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is a palindrome: " + isPalindrome);
    }
}