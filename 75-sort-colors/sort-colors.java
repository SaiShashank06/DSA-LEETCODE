class Solution {

    public void sortColors(int[] nums) {
       int n=nums.length;
       int left=0,right=n-1,mid=0;
       while(mid<=right){
       
       if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[left];
        nums[left]=temp;
        left++;
        mid++;
       }
      else if(nums[mid]==1){
        mid++;
       }
       //nums[mid]==2 cond
       else{
        int temp=nums[mid];
        nums[mid]=nums[right];
        nums[right]=temp;
        right--;
       }
        
       }
      
    }
}
/*
approach :DUCH NATIONAL FLAG ALGORITHM:
Dutch National Flag Algorithm (Theory)
Intuition

The array contains only three values: 0, 1, and 2.

We divide the array into four regions:

| 0s | 1s | Unknown | 2s |
  ^     ^      ^      ^
 left   mid          right
0 should go to the left side.
1 should remain in the middle.
2 should go to the right side.

To achieve this, we maintain three pointers:

left → position where the next 0 should be placed.
mid → current element being processed.
right → position where the next 2 should be placed.
Algorithm

While mid <= right:

Case 1: nums[mid] == 0
Swap nums[mid] and nums[left].
Increment both left and mid.

Reason:

The 0 is moved to its correct position on the left.
Case 2: nums[mid] == 1
Increment mid.

Reason:

1 is already in the correct middle region.
Case 3: nums[mid] == 2
Swap nums[mid] and nums[right].
Decrement right.

Reason:

The 2 is moved to the right side.
Do not increment mid because the element swapped from the right has not been processed yet.


ANOTHER APPROACH :
TAKE 3 VAR  count no of 0,1,2 ansd modify array in order ti 0,1,2

*/
 