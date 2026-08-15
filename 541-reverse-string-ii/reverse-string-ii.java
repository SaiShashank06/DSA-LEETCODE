class Solution {
    public void reverse(int i,int j, char[] str){
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        int n=s.length();

        char[] str=s.toCharArray();

        for(int i=0;i< n-1 ;i+=2*k){
            if(i+k-1 <= n-1){
                reverse(i,i+k-1,str);
            }
            else reverse(i,n-1,str);

        }

        return new String(str);
 
    }
}

/**
Conversion to an array: It is convenient to work with an array of characters char[] instead of a string String, because you can easily swap characters.
Cycle in 2k increments: The for loop with a step of 2 * k iterates through the groups in the row.
Reversal limits: It is important to correctly identify the beginning (start) and the end (end) of the reversed part, so as not to go beyond the line, especially for incomplete groups. Math.min() helps in this.
Auxiliary function reverse(): It is better to put the reversal of a part of the array in a separate function for clarity and convenience.
Key things to understand:

The size of the 2k group and how it affects processing.
How to correctly define the boundaries of the reversed part (start and end).
How to process the remainder (incomplete group).
 */