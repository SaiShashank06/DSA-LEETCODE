class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            //odd palindrome 
            int p1=i,p2=i;
            String pal="";
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;


            }
            String temp=s.substring(p1+1,p2);

            if(temp.length() > ans.length()){
                ans=temp;
            }

            //even palindrome
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
                
            }

            temp=s.substring(p1+1,p2);
             if(temp.length() > ans.length()){
                ans=temp;
            }

        }
        return ans;


    }
}