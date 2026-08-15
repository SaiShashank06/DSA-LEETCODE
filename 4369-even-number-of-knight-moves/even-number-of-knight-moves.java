class Solution {
    public int  move=-1;
    boolean v[][] =new boolean[8][8];
    boolean Reach(int[] start,int[] target, int i,int j,int moves){
         if(i>=8 || j>=8 || i<0 || j<0 ) return false;
        if(v[i][j]) return false;
        if(v[i][j] == false){
            v[i][j]=true;
        }
        if(i==target[0] && j==target[1]) {
            move=moves;
            return true;
        }

       return  Reach(start,target,i+1,j+2,moves+1)||
            Reach(start,target,i-1,j+2,moves+1)||
            Reach(start,target,i+1,j-2,moves+1)||
            Reach(start,target,i-1,j-2,moves+1)||
            Reach(start,target,i+2,j+1,moves+1)||
            Reach(start,target,i-2,j+1,moves+1)||
            Reach(start,target,i+2,j-1,moves+1)||
            Reach(start,target,i-2,j-1,moves+1);
        
    }
    public boolean canReach(int[] start, int[] target) {
        Reach(start,target,start[0],start[1],0);
        if(move %2 ==0 && move!= -1 ) return true;
        else return false;
    }
}
//approaach bfs