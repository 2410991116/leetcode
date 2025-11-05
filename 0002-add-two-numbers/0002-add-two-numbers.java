/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add current values if present
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Compute digit and carry
            carry = sum / 10;
            int digit = sum % 10;

            // Create new node for the digit
            curr.next = new ListNode(digit);
            curr = curr.next;
        }

        // Return the next of dummy (head of new list)
        return dummy.next;
    }
}
