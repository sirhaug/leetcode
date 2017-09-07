package algorithms.problem003;

/**
    Given a string, find the length of the longest substring without repeating characters.

    Examples:
        * Given "abcabcbb", the answer is "abc", which the length is 3.
        * Given "bbbbb", the answer is "b", with the length of 1.
        * Given "pwwkew", the answer is "wke", with the length of 3.
          Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        boolean[] exists = new boolean[256];
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            while (exists[s.charAt(j)]) {
                exists[s.charAt(i)] = false;
                i++;
            }
            exists[s.charAt(j)] = true;
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }

}
