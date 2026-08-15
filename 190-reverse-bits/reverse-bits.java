class Solution {
    public int reverseBits(int n) {
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<32;i++){
           
              if((n&1)==1){
                rev.append("1");
              }else{
                rev.append("0");
              } 
              n>>>=1;
        }

        String a=rev.toString();
    
        return (int)Long.parseLong(a,2);
    }
}