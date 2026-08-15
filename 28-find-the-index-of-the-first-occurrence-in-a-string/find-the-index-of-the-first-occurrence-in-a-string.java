class Solution {

    public int str(String hay, String need, int i) {

        if (i > hay.length() - need.length()) {
            return -1;
        }

        if (hay.substring(i, i+need.length()).equals(need)) {
            return i;
        }

        return str(hay, need, i +1);
    }

    public int strStr(String haystack, String needle) {
        return str(haystack, needle, 0);
    }
}