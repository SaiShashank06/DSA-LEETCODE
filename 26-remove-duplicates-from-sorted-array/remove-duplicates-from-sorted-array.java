class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
            nums[j]=nums[i];
            
            j++;
           }
        }
        return j;
    }
}
/**
Approach & Step-by-Step Visualization🔍:
The code starts iterating from i = 1 because we need to compare each element with its previous element to check for duplicates.

1 . Initialize j = 1 (first unique element is already at nums[0]).

2 . Loop from i = 1 to end:

If nums[i] != nums[i-1] (new unique element found):
▪ Store it at nums[j]
▪ Increment j
3 . Return j (number of unique elements).
 */