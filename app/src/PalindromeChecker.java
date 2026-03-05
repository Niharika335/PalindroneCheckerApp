import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String input = scanner.nextLine();

        System.out.println("\n--- UC13: Performance Results ---");

        // --- Method 1: StringBuilder Reversal ---
        long start1 = System.nanoTime();
        boolean isPal1 = isPalindromeReversal(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // --- Method 2: Two-Pointer Approach ---
        long start2 = System.nanoTime();
        boolean isPal2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Display Validation Result
        System.out.println("Is Palindrome? : " + isPal1);

        // Display Execution Times
        System.out.println("Execution Time (Reversal):    " + time1 + " ns");
        System.out.println("Execution Time (Two-Pointer): " + time2 + " ns");

        scanner.close();
    }

    // Algorithm A: Reversal (Uses more memory)
    public static boolean isPalindromeReversal(String s) {
        String cleaned = s.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Algorithm B: Two-Pointer (More efficient)
    public static boolean isPalindromeTwoPointer(String s) {
        String cleaned = s.toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left++) != cleaned.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}