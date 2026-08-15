class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
           long currMass=mass;
        for(int i=0;i<n;i++){
               if(currMass<asteroids[i]){
                return false;
               }
               
                currMass+=asteroids[i];
               

        }
        return true;
    }
}