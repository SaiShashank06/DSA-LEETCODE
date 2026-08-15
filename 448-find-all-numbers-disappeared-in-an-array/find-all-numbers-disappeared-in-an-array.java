class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                
                nums[idx]= -(nums[idx]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
/*for i=1 to n 
make nums[i]-1 th index as negitive value

using for loop add index+1 th index to list 

approach : make elemeny containing values as -ve retuen positive idx+1 as list
*/

