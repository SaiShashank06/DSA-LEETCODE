class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        int max=1;

        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        for(int i: set){
            if(!set.contains(i-1)){
                int x=i;
               int count=1;
            

                while(set.contains(x+1)){
                   x=x+1;
                   count++;
                }
            max= Math.max(max,count);
        
            }
        }

        return max;
        
    }
}
/**

Algorithm
We will use two variables: cnt to store the length of the current sequence and longest to store the maximum length found.
First, place all the array elements into a set data structure to allow efficient lookups for consecutive numbers.
For each element x that can start a sequence (i.e., x - 1 does not exist in the set), we follow these steps:
Initialize cnt to 1, indicating the starting element of a new sequence.
Use the set to search for consecutive elements such as x + 1, x + 2, and so on, to determine the maximum possible length of the current sequence. Update cnt accordingly.
Compare cnt with longest and update longest to hold the maximum value: longest = max(longest, cnt).
Finally, longest will contain the length of the longest consecutive sequence found in the array.

 */

