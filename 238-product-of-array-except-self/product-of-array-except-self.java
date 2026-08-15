class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int prefix=1;
        for(int i=0;i<nums.length;i++){
          a[i]=prefix;
          prefix*=nums[i];
        }
         int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]*=suffix;
            suffix*=nums[i];
        }
        return a;

    }
}
/**
We don’t need extra arrays.

We can:

Store prefix in result array  
Then multiply suffix while traversing backward
🔄 Algorithm (Approach 2)
1️⃣ Build prefix in result:

res[i] = product of elements before i
2️⃣ Traverse from right:

multiply suffix while updating result
📌 Step-by-Step Example
nums = [1,2,3,4]
Step 1 (prefix in res):

res = [1,1,2,6]
Step 2 (suffix multiply):

suffix = 1  

i=3 → res[3]=6*1=6  
i=2 → res[2]=2*4=8  
i=1 → res[1]=1*12=12  
i=0 → res[0]=1*24=24  
Final:

[24,12,8,6] ✅
⏱️ Complexity (Approach 2)
Time: O(n)  
Space: O(1) (excluding output array)
 */