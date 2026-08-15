class Solution {
   

    
    public int countValidPrefixes(String s) {
        int count=0;
        int n=s.length();
        int zero=0,one=0;
        
        for(int i=0 ; i<n;i++){
            char c=s.charAt(i);

            if(c=='0')
                zero++;
            else one++;

            

            if(Math.abs(one-zero)<=1) count++;
        }

        return count;
    }
}