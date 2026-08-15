class Solution {
    int powerOfTwo(int n){
        return (1<<n);
    }
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        for(int i=0;i<32;i++){
            if(powerOfTwo(i)==n)
            return true;
        }
        return false;
    }
}
/* 
another sol:return n>0&&(n&(n-1)==0)
 */