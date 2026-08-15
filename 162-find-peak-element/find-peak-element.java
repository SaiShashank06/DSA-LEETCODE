class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;
        int left=0,right=n;

        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else left=mid+1;
        }


        return left;
        
    }
}
/**
Appraoch :

in other words, if a number at middle + 1 index is less than a number at middle index, we have one of peaks on the left side of middle index, so move the right pointer to middle. Middle pointer itself may be one of peaks.

On the other hand, middle + 1 is greater than middle, we should move left pointer to middle + 1.
 */
