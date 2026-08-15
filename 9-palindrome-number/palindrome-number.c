bool isPalindrome(int x) {
    int n=x;
    if(x<0)
    return false;
    int i;
    long long int a=0;
    while(n!=0){
        i=n%10;
        a=a*10+i;
        n=n/10;
    }
    if(x==a)
    return true;
    return false;
}