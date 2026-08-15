class Solution {

    List<List<Integer>> res=new ArrayList<>();

   void  backtrack(int target,int[] nums,int idx,List<Integer>list){
    if(target==0){
       res.add(new ArrayList<>(list));
       return;
    }
    if(target<0){
        return;
    }

    for(int i=idx;i<nums.length;i++){
        //prevent duplicate combination
        if(i>idx && nums[i]==nums[i-1]) continue;
        if(nums[i]>target) break;
        list.add(nums[i]);
        backtrack(target-nums[i],nums,i+1,list);
        list.remove(list.size()-1);
    }
   }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(target,candidates,0,new ArrayList<>());
        return res;
    }
}
//same as comBitational sum 1