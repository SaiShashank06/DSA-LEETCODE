class Solution {
    public int minimumDifference(int[] nums, int k) {
        int i=0,j=k-1;

        Arrays.sort(nums);
      int mini=Integer.MAX_VALUE;

        while(j<nums.length){
             mini=Math.min(mini,nums[j]-nums[i]);
            i++;
            j++;

        }

        return mini;
    }
}

/**
Approach
Sort the array
Use a sliding window of size k
For each window, calculate
max − min = nums[right] − nums[left]
Keep track of the minimum difference
 */