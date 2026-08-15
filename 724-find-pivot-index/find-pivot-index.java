class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
           rightSum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            if(leftSum==rightSum){
                return i;
            }
            rightSum-=nums[i];
        }
        return -1;
    }
}
/**
approach,pattern prefixsum
left=0,right=total sum 
addd elem to left cheak left==right if s return i 
remove elem from right
 */