class Solution {

    List<List<Integer>> list=new ArrayList<>();

   void sum(int target,int[] arr,int idx,List<Integer> sums){
        if(target==0) 
        {
            list.add(new ArrayList<>(sums));
            return;
        
        }

        if(target < 0) return;

        for(int i=idx;i<arr.length;i++){
            sums.add(arr[i]);
            sum(target-arr[i],arr,i,sums);

            //remove last elem
            sums.remove(sums.size()-1);
        }

       

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        sum(target,candidates,0,new ArrayList<>());
        return list;
    }
}

/**
Intuition
The problem asks us to find all unique combinations of numbers that sum up to the target. Since a number can be chosen multiple times, we can use recursion and backtracking to explore all possible combinations. At each step, we either include a number and continue searching for the remaining target or backtrack when the target becomes negative.

Approach
Create a result list to store all valid combinations.
Use a backtracking function that keeps track of:
The current combination (currentPath)
The remaining target
The starting index to avoid generating duplicate combinations in different orders.
If the target becomes 0, a valid combination is found, so add a copy of the current path to the result.
If the target becomes negative, stop exploring that path.
Iterate through the candidates starting from the current index:
Add the current number to the path.
Recursively call the function with the reduced target.
Pass the same index because the same number can be used multiple times.
Remove the last added number to backtrack and explore other possibilities.
Complexity
Time complexity:

O(N^(T/M))
Where:

N = number of candidates
T = target value
M = minimum value among the candidates
In the worst case, the recursion explores all possible combinations.

Space complexity:

O(T/M)
This is the maximum depth of the recursion stack when the smallest candidate is repeatedly chosen.

 */