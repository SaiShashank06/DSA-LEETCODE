class Solution {
    public int lengthOfLastWord(String s) {
        int st=0;
        int end=s.length()-1;
        while(end>=0 && s.charAt(end)==' ')
        end--;

        st=end;


          
        for(int i=end;i>=0;i--){
        if(s.charAt(i)==' ')
        break;
        st=i;
        }
       int len =s.substring(st,end+1).length();
          return len;



    }
}