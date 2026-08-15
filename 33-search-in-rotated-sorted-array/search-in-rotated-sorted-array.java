class Solution {
    public int search(int[] nums, int target) {
        int max=0,i=0;
        while(i<nums.length){
            if(nums[i]>nums[max])
            max=i;
            i++;
        }
        int a,b,end=nums.length-1;
        a=binarySearch(nums,target,0,max);
        b=binarySearch(nums,target,max+1,end);
        if(a!=-1) return a;
        else return b;
        
    }
    public int binarySearch(int[] nums , int target,int low,int high){
        int i;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else 
                 low =mid+1;

        }
        return -1;
    }

}