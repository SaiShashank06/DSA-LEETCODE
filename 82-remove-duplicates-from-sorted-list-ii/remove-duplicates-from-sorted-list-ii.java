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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode temp = head;
        ListNode prev=dummy;

        while(temp!=null){

            if(temp.next!=null && temp.val==temp.next.val){

                while(temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }

                prev.next=temp.next;
            }
            else{
                prev=prev.next;
            }
            temp=temp.next;
        }

        return dummy.next;

      
    }
}
/**
Approach
Use a dummy node pointing to the head.
Traverse the list using two pointers: prev (last confirmed unique node) and cur (current node being inspected).
If cur.val == cur.next.val, skip all nodes with the same value.
Otherwise, move prev forward.
Return the list starting from dummy.next.
 */