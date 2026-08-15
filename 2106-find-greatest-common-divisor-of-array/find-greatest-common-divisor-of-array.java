class Solution {

    int gcd(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;

        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            mini=Math.min(mini,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }

        return gcd(mini,maxi);
    }
}