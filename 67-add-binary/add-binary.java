class Solution {
    public String addBinary(String a, String b) {
        StringBuilder st=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;



        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';

            }
            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }
            st.append(sum%2);
            carry=sum/2;
        }


        return st.reverse().toString();
    }
}


/**

Iteration 1
a[i]=0
b[j]=1

sum=0+0+1=1

Append

1

carry

0
st="1"
 */