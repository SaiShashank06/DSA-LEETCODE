class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())
        return false;
        Map<Character,Integer> map=new HashMap <>();
        
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.containsKey(curr)){
             map.put(curr,map.get(curr)+1);
            }
            else{
                map.put(curr,1);
            }

        }
        for(int i=0;i<t.length();i++){
            char curr=t.charAt(i);

            if(!map.containsKey(curr) || map.get(curr)==0)
             return false;

             map.put(curr,map.get(curr)-1);
        }

    return true;
}
}

/**
use array with length 26
to store frequency 
 */