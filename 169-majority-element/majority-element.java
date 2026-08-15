//Boyer-Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer> intMap =new HashMap<>();
    int cand=nums[0],count=1;
    for(int i=1;i<nums.length;i++){
        if(cand==nums[i])
        count++;
        else{
            count--;
            if(count==0){
                cand=nums[i];
                count=1;
            }
        }

    }
    return cand;

        
    }
}