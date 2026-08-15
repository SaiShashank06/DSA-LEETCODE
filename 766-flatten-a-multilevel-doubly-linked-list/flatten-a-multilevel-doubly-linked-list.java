/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while( temp!=null){
            if(temp.child!=null){
                Node nextNode=temp.next;

                //find tail of child node
                Node childNode=temp.child;
                while(childNode.next!=null)
                   childNode=childNode.next;


                 //connect child tail with nextNode
                   if(nextNode!=null){
                    childNode.next=nextNode;
                    nextNode.prev=childNode;

                   }

                   //connect child ith current
                   temp.next=temp.child;
                   temp.child.prev=temp;
                   temp.child=null;
                     
            }
            temp=temp.next;
        }
        return head;

    }
}
/**
Approach
Iterate through the list using a current pointer
When current node has a child:

1. Save the next node (the "after" part)

2. Find the tail of the child chain

3. Connect child tail to the saved next node

4. Connect current node to child head

5. Clear the child pointer
Continue iteration - the algorithm naturally processes nested children
Return the original head

Complexity
Time complexity: O(n) - every node is visited just once
Space complexity: O(1)
 */