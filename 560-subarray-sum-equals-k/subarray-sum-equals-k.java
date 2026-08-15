class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0; 
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
              count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
           
        }
        return count;
    }
}
/**
Maintain a running prefix sum Sum.

Store frequencies of prefix sums in a HashMap.

Initialize the map with {0 : 1} to handle subarrays starting from index 0.

For each element:

Update currSum.
Find how many times currSum - k has appeared before.
Add that frequency to the answer.
Update the frequency of currSum.
Return the total count.

Complexity
Time Complexity: O(N)
Space Complexity: O(N)
 */