/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        int m=0,n=0;
       while(temp1!=temp2){
        if(temp1!=null){
            temp1=temp1.next;
        }else{
            temp1=headB;

        }

        if(temp2!=null){
            temp2=temp2.next;
        }else{
            temp2=headA;
        }
       }

       return temp1;





    }
}

/**


comparing the addresses not values of node 
Tracing Example

List A:
A1 → A2 → C1 → C2 → null

List B:
B1 → B2 → B3 → C1 → C2 → null

(C1 and C2 are common nodes)

Initially:
temp1 = A1
temp2 = B1

Iteration | temp1                | temp2
-----------------------------------------------
1         | A1 → A2             | B1 → B2
2         | A2 → C1             | B2 → B3
3         | C1 → C2             | B3 → C1
4         | C2 → null           | C1 → C2
5         | null → headB (B1)   | C2 → null
6         | B1 → B2             | null → headA (A1)
7         | B2 → B3             | A1 → A2
8         | B3 → C1             | A2 → C1
9         | C1                  | C1   ← Both pointers meet

Return C1.
 */