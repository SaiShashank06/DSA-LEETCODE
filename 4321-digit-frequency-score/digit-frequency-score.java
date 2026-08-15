class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map=new HashMap<>();
            
       
        while(n>0){
           int rem=n%10;
           int key=rem;
        
           map.put(key,(map.getOrDefault(key,0))+1);
           n=n/10;
        }
        int score=0;
        for(int i=0;i<10;i++){
            score=score+i*map.getOrDefault(i,0);
        }
        return score;

    }
}