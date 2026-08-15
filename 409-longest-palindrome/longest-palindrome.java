class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int ans=0;

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
           
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
       int even=0,odd=0;
        for(char key: map.keySet()){
            if((map.get(key) % 2) == 0){
               ans+=map.get(key);
            }
            else {
                odd++;
                ans+=map.get(key)-1;
            }

        }
       if(odd>0){
        ans++;
       }

        return ans;
        

    }
}