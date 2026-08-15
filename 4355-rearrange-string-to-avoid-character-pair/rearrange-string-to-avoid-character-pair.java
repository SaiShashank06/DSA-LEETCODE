class Solution {
    public String rearrangeString(String s, char x, char y) {
       
      
         StringBuilder X=new StringBuilder();
         StringBuilder Y=new StringBuilder();
         StringBuilder O=new StringBuilder();
        

    for(int i=0 ;i<s.length();i++){
       char  curr=s.charAt(i);


        if(curr==x) X.append(curr);
        else if(curr==y) Y.append(curr);
        else  O.append(curr);
    }


       

        return Y.append(O).append(X).toString();
        

        
        



        

        
    }
}