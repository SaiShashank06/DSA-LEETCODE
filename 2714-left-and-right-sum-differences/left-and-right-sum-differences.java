class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++)
            right += nums[i];

        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            ans[i]=Math.abs(left-right);
            left+=nums[i];
        }

        return ans;
       

    }
}
/**
approach optimal:prefisSum pattern;


brute force:
 public int[] leftRightDifference(int[] nums) {
        int left,right;
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            left=0;
            right=0;
            int j=i-1;
        
            while(j>=0){
                
                left+=nums[j];
                j--;

            }
            int k=i+1;
            while(k<nums.length){
                right+=nums[k];
                k++;
            }
            leftSum[i]=left;
            rightSum[i]=right;
        }
        
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
 */