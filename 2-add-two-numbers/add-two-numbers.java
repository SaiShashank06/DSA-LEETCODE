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
        ListNode head=new ListNode(0);
        ListNode sum=head;
        int carry=0;

        while(l1!=null || l2!=null){
        int x=(l1!=null)? l1.val :0 ;
        int y=(l2!=null) ?l2.val:0;

        int sums=x+y+carry;
        carry=sums/10;
        sum.next=new ListNode(sums%10);
        sum=sum.next;

        
       if(l1!=null) l1=l1.next;
       if(l2!=null) l2=l2.next;

        }
        if(carry>0) sum.next=new ListNode(carry);
        return head.next;
    }
}
/**
We will simulate the digit-by-digit addition using a pointer for each list.

Use a Dummy Node: We'll start with a "dummy" node. This acts as a placeholder so we don't have to write extra logic to handle the very first node of our result list.
The Loop: We loop as long as there is a node left in l1, a node left in l2, or a carry from the previous addition.
Summation: Inside the loop, we sum the values of the current nodes (if they exist) and add the current carry.
Calculate Carry and Digit: The new digit to store in the node is total % 10.
The new carry is total / 10.
Move Forward: We create a new node with our digit, link it to our result, and move our pointers (l1, l2, and our current result pointer) one step forward.
Cleanup: Finally, we return the node after the dummy node, as that's where our actual sum begins.
 */