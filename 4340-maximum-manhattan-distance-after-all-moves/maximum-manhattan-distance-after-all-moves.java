class Solution {
    public int maxDistance(String moves) {

           int x=0,y=0,count=0;
        for(int i=0;i<moves.length();i++){
           char curr=moves.charAt(i);
              if(curr=='U')
               x++;
            else if(curr=='D')
               x--;

            else if(curr=='L')
              y++;
            else if(curr=='R')
              y--;
            else count++;

        }

        return Math.abs(x)+Math.abs(y)+count;
    }
}
/**
Intuition
Ignoring '?' characters, we first compute the final position after performing all fixed moves.

Each '?' can be replaced by any direction. To maximize the Manhattan distance from the origin, every blank move should be used to move farther away from the current position.

Since each such move can increase the Manhattan distance by at most 1, the answer becomes:

current Manhattan distance + number of blanks.
Approach
Traverse the string and simulate fixed moves:

U → decrease x
D → increase x
L → decrease y
R → increase y
Count the number of '?' characters.

Compute the Manhattan distance contributed by fixed moves:

|x| + |y|
Every blank move can increase the distance by 1, so add the number of blanks.

Return the result.


 */