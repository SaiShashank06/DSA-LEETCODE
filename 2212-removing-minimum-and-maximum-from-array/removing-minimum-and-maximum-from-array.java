class Solution {
    public int minimumDeletions(int[] nums) {

        

        int minIndex=0,maxIndex=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minIndex]){
                
                minIndex=i;
            }

            if(nums[i] > nums[maxIndex]){
                
                maxIndex=i;
            }
        }

        int n=nums.length;

        int a=Math.max(minIndex,maxIndex)+1;

        int b = n-Math.min(minIndex,maxIndex);

        int c = maxIndex+1+n-minIndex;

        int d= minIndex+1+n-maxIndex;

          return Math.min(Math.min(a, b), Math.min(c, d));
       




        
    }
}

/**

💡 Intuition

We need to delete both the minimum and maximum elements from the array.

For each of them, we can delete from either:

Left side
Right side

So there are only 3 useful strategies:

Delete both elements from the left
Delete both elements from the right
Delete one from the left and the other from the right

We first find the indices of the minimum and maximum elements.

Example

Suppose:

nums = [2, 10, 7, 5, 4, 1, 8]
                 ↑     ↑
                max   min

If:

idxmx = 1
idxmn = 5

Then:

1. Both from left

The farther element determines how many we delete:

Math.max(idxmx, idxmn) + 1
2. Both from right

The closer-to-left of the two determines the number remaining from the right:

n - Math.min(idxmx, idxmn)
3. One from each side

There are two possibilities:

idxmx + 1 + n - idxmn

or

idxmn + 1 + n - idxmx

Take the minimum of all possibilities.

Approach
Find the index of the minimum element.
Find the index of the maximum element.
Calculate the deletion count for all possible ways:
Both from left
Both from right
Min from left, max from right
Max from left, min from right
Return the minimum.

 */