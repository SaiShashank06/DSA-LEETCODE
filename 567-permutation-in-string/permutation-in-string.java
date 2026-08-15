class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

          if(s1.length()>s2.length()){
            return false;
          }
          int[] c1=new int[26];
          int[] c2=new int[26];
        for(int i=0;i<n;i++){
           
           c1[s1.charAt(i)-'a']++;
           c2[s2.charAt(i)-'a']++;

        }

        if(Arrays.equals(c1,c2))
           return true;


             for (int i = n; i < m; i++) {
            c2[s2.charAt(i) - 'a']++;
            c2[s2.charAt(i - n) - 'a']--;
            

             if(Arrays.equals(c1,c2))
                return true;

             }
             return false;

    }
}


/**
The sliding window technique allows us to efficiently compare character frequencies in substrings of s2 with s1. Here's the approach:

Use a dictionary to count character frequencies for s1.
Maintain a window of size len(s1) on s2 and keep track of character frequencies in that window.
Slide the window across s2, updating the character counts and comparing them to s1's coun
 */