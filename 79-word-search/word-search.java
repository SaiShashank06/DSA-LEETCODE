class Solution {
    //dfs around path where start char matches with baoard[i][j]
    public boolean dfs(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length())  return true;
          int m=board.length;
        int n=board[0].length;
        if(i<0 ||i>=m || j<0|| j>=n) return false;
         if(board[i][j]!= word.charAt(idx))  return false;
        char temp=board[i][j];
        //mark as visited
         board[i][j]='#';

         boolean found=dfs(board,word,i+1,j,idx+1)||
                        dfs(board,word,i-1,j,idx+1)||
                        dfs(board,word,i,j+1,idx+1)||
                        dfs(board,word,i,j-1,idx+1);
        
       //backtrack
        board[i][j]=temp;
        return found;



    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int len=word.length();
        if(len>m*n) return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                   if(dfs(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
}
/**
Intuition
We need to determine if the word can be formed by walking through adjacent cells (up/down/left/right) without revisiting a cell in the same path. Depth-first search (DFS) from each cell that matches the first character, marking visited cells during the path and unmarking on backtrack, is a natural fit.

Approach
If the word length is greater than m * n, return false immediately.
For each cell in the board:
If the cell matches word[0], start a DFS from that cell.
DFS function:
If we've matched all characters (index == word.length), return true.
If coordinates are out of bounds or cell doesn't match the current character, return false.
Temporarily mark the cell as visited (e.g. replace with a sentinel like '#').
Recur in four directions for the next character index.
Restore the cell (backtrack).
Return true if any direction succeeds.
If no start leads to a full match, return false.
Follow-up (search pruning):

If needed for larger boards, order the search by trying the rarer characters first (compare frequency of characters in word vs in board).
Early reject if a required character appears fewer times in the board than in the word.
Optionally start DFS from positions where the remaining path is more constrained (heuristics).
Complexity
Time complexity:
In the worst case, DFS can explore up to O(m * n * 4^L) where L = word.length because from each cell there are up to 4 choices and we may start DFS from each cell. However constraints (m,n ≤ 6 and L ≤ 15) make it acceptable.

Space complexity:
O(L) recursion depth (plus O(1) extra if modifying board in-place).
 */