class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        String ans = "";
        String temp = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                if (!temp.isEmpty()) {
                    ans += temp + " ";
                    temp = "";
                }
            } else {
                temp = ch + temp;
            }
        }

        ans += temp;

        return ans;
    }
}