class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radadar";
        Node head = createLinkedList(input);

        // Step 1: Find the middle using Fast and Slow pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half in-place
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // Step 3: Compare halves
        boolean isPalindrome = true;
        Node tempSecond = secondHalf;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        System.out.println("String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    // Helper: Reverse a linked list in-place
    private static Node reverseList(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Helper: Convert String to Linked List
    private static Node createLinkedList(String s) {
        if (s.isEmpty()) return null;
        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }
}