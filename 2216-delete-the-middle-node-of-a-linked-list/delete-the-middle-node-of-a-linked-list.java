class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        if(head==null || head.next==null){
            return null;
        }

         if(head.next.next==null){
            head.next=null;
            return head;
         }

         while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
         }
         prev.next=slow.next;
         

        
         return head;
        
    }
}/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 /**Approach :fast and slow pointers 

 maintain a prev to store prev node of slow 
 now delete node where slow stops 

 
  */
