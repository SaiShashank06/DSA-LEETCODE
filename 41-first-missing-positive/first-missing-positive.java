class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

       int i=0;
       while(i<n){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                    int a=nums[i]-1;

                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
            }
            else i++;
        }

        for( i=0;i<n;i++){
            if(nums[i]!=i+1)
                    return i+1;
        }

        return nums.length+1;
        
    }
}

/**
⚡ Approach
✅ Step 1 — Place every number correctly
For every element,

Ignore numbers <= 0
Ignore numbers > n
If the current element is not at its correct position,
swap it with its destination.
value = x

correct index = x - 1
This rearranges the array in-place.

✅ Step 2 — Find the first mismatch
Traverse the array once.

If nums[i] != i + 1

return i + 1
If every position is correct,

return n + 1
🎯 Dry Run
Input
[3,4,-1,1]
After Cyclic Sort
[1,-1,3,4]
Verification
Index 0 ➜ 1 ✅

Index 1 ➜ Expected 2
           Found -1 ❌
Hence,

Answer = 2


 */