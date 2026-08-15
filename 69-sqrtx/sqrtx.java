class Solution {
    public int mySqrt(int x) {
       // while(x%2!=0)
       // x//=x&2;
       int low=0,high=x,ans=-1;
       while(low<=high){
        long mid=low+(high-low)/2;
        long midsq=mid*mid;
        if(midsq==x)
        return (int)mid;
        else if(midsq>x)
        high=(int)mid-1;
        else {
            ans=(int)mid;
            low=(int)mid+1;
        }
       }

    return ans;
/*
binary search :
let x=8
low=0,high =8
mid=4;
midsq=16
since midsq>x
high =mid-1  4-1=3
2
mid=1
midsq=1;


*/

    }
}