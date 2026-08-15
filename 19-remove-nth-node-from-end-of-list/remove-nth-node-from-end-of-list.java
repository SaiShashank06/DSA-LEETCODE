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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        // Reverse the entire list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev; // new head of reversed list

        // Delete nth node from start of reversed list
        if (n == 1) {
            head = head.next;
        } else {
            ListNode temp = head;

            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        // Reverse back
        prev = null;
        curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}