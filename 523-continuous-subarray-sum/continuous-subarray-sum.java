class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
            int n=nums.length;
       
       Map<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
            int sum=0;
       for(int i=0;i<n;i++){
                sum=sum+nums[i];

                int mod=sum%k;

                if(map.containsKey(mod)){
                    if(i-map.get(mod)>=2){
                        return true;
                    }
                }

                else{
                    map.put(mod,i);
                }
       }

       return false;





        
    }
}
/**
Intuition
What does “sum is multiple of k” mean?
sum % k == 0
Approach
If two sums have same remainder/mod
sum[i] % k == sum[j] % k
Then
subarray sum between them % k == 0
That’s the trick here
Logic
Example Walkthrough: nums = [5, 0, 0] k = 3
Iteration 1:
i = 0
sum = 5
mod = 5 % 3 = 2
map doesn’t contain 2 -> store it
map = {0:-1, 2:0}
Iteration 2:
sum = 5
mod = 2     -> Already exists
Check length: 1 - 0 = 1 (< 2 ❌)
Not valid yet
Iteration 3:
i = 2
sum = 5
mod = 2   -> Exists again
Check length: 2 - 0 = 2 (>= 2 ✅)
Found valid subarray!

\ */