class Solution {
    public int maxProduct(int n) {
        int one=0,two=0;
        while(n!=0){
          int rem=n%10;
          if(rem>=one){
                two = one;
                one=rem;
          }

        else  if(rem>two){
            two=rem;
          }

          n=n/10;


        }

        return one*two;
        
    }
}