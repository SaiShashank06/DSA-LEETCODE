class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int totalSum, n;
        n=grid.length;
        int size=n*n;
        int[] count=new int[size+1];
       

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               count[grid[i][j]]++;
            }
        }
        int rep=-1,miss=-1;
        for(int i=1;i<=size;i++){
            if(count[i]==2){
                rep=i;
            }
            else if(count[i]==0){
                miss=i;
            }
        }
        int[] result={rep,miss};
        return result;
    }
}
/**
time O(n^2),=space;
optimal space=O(1);
 */