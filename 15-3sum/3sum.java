class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           
            if(i>0 &&nums[i]==nums[i-1] ){
                continue;
            }

            int j=i+1,k=nums.length-1;

           while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(  sum== 0){
                 List<Integer> a=new ArrayList<>();
                a.add(nums[i]);
                a.add(nums[j]);
                a.add(nums[k]);

                ans.add(a);
                j++;
                k--;
                while(j<k && nums[j] == nums[j-1]){

                    j++;
                }
                
                while( j<k && nums[k]==nums[k+1]) k--;


            }
            else if(sum >0){
                k--;
            }

           else j++;

           } 
        }

        return ans;

        
    }
}
/**

approach :
 
1 + 2 poimnters 

sort 
fix one num apply two sun to fetch the target

 */