class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        int n = nums.length;
        int c1=0,e1 = Integer.MIN_VALUE,c2=0,e2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            if(c1==0 && nums[i]!=e2){
                c1++;
                e1=nums[i];
            }
            else if(c2==0 && nums[i]!=e1){
                c2++;
                e2=nums[i];

            }
            else if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) c1++;

            if(nums[i] == e2) c2++;
        }

        if(c1> n/3) ans.add(e1);

        if(c2 > n/3) ans.add(e2);

        return ans;
        
    }
}
/**
Algorithm Overview:
Initialize majority1, majority2, count1, and count2 to track the majority elements and their counts.
Iterate through the input list nums to find the two majority elements.
Iterate through nums again to verify the counts of the two majority elements.
Return a list of majority elements that appear more than len(nums) // 3 times.
Detailed Explanation:
Initialization:

Initialize majority1, majority2, count1, and count2 to 0. These variables will be used to keep track of the majority elements and their counts.
First Iteration to Find Majority Elements:

Iterate through the input list nums.
If the current number is equal to majority1, increment count1.
If the current number is equal to majority2, increment count2.
If count1 is 0, update majority1 to the current number and increment count1.
If count2 is 0, update majority2 to the current number and increment count2.
If both count1 and count2 are non-zero and the current number is not equal to either majority, decrement count1 and count2.
Second Iteration to Verify Counts:

Reset count1 and count2 to 0.
Iterate through nums again.
Count the occurrences of majority1 and majority2 by incrementing count1 and count2 accordingly.
Result Generation:

Create an empty list res to store the majority elements.
If count1 is greater than len(nums) // 3, add majority1 to res.
If count2 is greater than len(nums) // 3, add majority2 to res.
Return the list res containing the majority elements that appear more than len(nums) // 3 times.
The algorithm uses the Boyer-Moore Majority Vote algorithm to find the majority elements in nums efficiently and then verifies their counts to ensure they appear more than len(nums) // 3 times before returning the result.

 */