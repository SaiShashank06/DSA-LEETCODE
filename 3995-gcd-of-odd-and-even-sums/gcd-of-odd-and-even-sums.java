class Solution {
    int gcd(int a, int b) {
    while (b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        for(int i=2;i<=2*n;i=i+2){
            even+=i;

        }
        for(int i=1;i<=2*n-1;i=i+2){
            odd+=i;
        }

      return gcd(odd,even);
        
    }
}