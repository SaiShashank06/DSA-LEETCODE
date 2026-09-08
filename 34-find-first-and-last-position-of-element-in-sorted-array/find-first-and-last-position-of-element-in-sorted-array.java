class Solution {

        int bst1(int[] arr,int target,int n){
            int low=0,high=n-1,start=-1;
            while(low<=high){
                int mid = (low+high)/2;

                if(arr[mid]==target){
                        start=mid;
                        high=mid-1;
                }
                 

                 else if(arr[mid]>target){
                    high=mid-1;
                 }
                 else low=mid+1;
            }
            return start;
        }

        int bst2(int[] arr,int target,int n){
            int low=0,high=n-1,end=-1;
            while(low<=high){
                int mid = (low+high)/2;

                if(arr[mid]==target){
                        end=mid;
                        low = mid+1;
                }
                 

                 else if(arr[mid]>target){
                    high=mid-1;
                 }
                 else low=mid+1;
            }
            return end;


        }

    public int[] searchRange(int[] nums, int target) {
       int ans[] = new int[2];

       ans[0]=bst1(nums,target,nums.length);
       ans[1] = bst2(nums,target,nums.length);


       return ans;
    }
}
/**
bst1 is to find start ocurance bst22 for end occurance

in bst1 find target if target found search store index ans  continue search for target on left side
in bst2 find target if target found search store index ans  continue search for target on right side





 */