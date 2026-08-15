class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s="";
        int length=strs.length;
        for(int i=0;i<strs[0].length();i++){
             if(strs[0].charAt(i)==strs[length-1].charAt(i)){

                s+=strs[0].charAt(i);
             }else{
                break;
             }
              

        }
        return s;
    }
}
/**
Approach
We'll use a sort-and-compare strategy:

Lexicographic sorting: Sort the string array alphabetically
Extreme comparison: After sorting, first and last strings are most different
Character-by-character matching: Compare characters at same positions in first and last strings
Prefix building: Accumulate matching characters into result string
Early termination: Stop when mismatch found or first string exhausted
This approach leverages the property that sorted strings preserve prefix relationships.
 */