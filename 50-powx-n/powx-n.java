class Solution {
    public double myPow(double x, int n) {
        double a=x;
       double ans=1;

       long N=n;

       if(N<0){
        N=-N;
        a=1/a;
       }
        while(N!=0){
           if((N&1)==1)
              ans=ans*a;

            a=a*a;
            N=N>>1;
            
        }
        return ans;
    }
}

/**
\SECOND APPROACH

In order to improve efficiency we will opt for Binary Exponentiation using which we can calculate xn using O log2(N) multiplications.

Basic Idea is to divide the work using binary representation of exponents
i.e. is to keep multiplying pow with x, if the bit is odd, and multiplying x with itself until we get 0
We will use very 1st example of 1st Approach i.e.
x = 7, n = 11 and pow = 1
Here, we have to calculate 711
Binary of n i.e. (11)10 is (1011)2
1   0   1   1
23  22  21  20   <-- Corresponding place values of each bit

OR we can also write this as
1 0 1 1
8 4 2 1 <-- Corresponding place values of each bit


 */