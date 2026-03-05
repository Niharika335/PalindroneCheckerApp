public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(input);
        System.out.println("Is it a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Step 1: Normalize (Lowercase + Remove non-alphanumeric)
        // [^a-zA-Z0-9] matches anything NOT a letter or number
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Step 2: Apply Two-Pointer Logic
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }
}