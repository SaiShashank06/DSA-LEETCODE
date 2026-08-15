class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}
/*
 * Procedure: lengthOfLongestSubstring
 *
 * Approach:
 * - Use Sliding Window technique with HashSet.
 * - Maintain a window [left, right] that contains only unique characters.
 *
 * Steps:
 * 1. Initialize two pointers: left = 0, right = 0
 * 2. Use a HashSet to store characters in the current window.
 * 3. Expand the window by moving 'right' pointer.
 * 4. If current character is NOT in set:
 *      - Add it to set
 *      - Update maxLength = max(maxLength, window size)
 * 5. If current character IS in set (duplicate found):
 *      - Shrink window from the left
 *      - Remove characters until duplicate is removed
 * 6. Continue until end of string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */