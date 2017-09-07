package algorithms.problem009;

class Solution {

    public boolean isPalindrome(int x) {

        String intString = Integer.toString(x);
        int i = 0;
        int j = intString.length() - 1;

        while (i < intString.length() / 2) {
            if (intString.charAt(i) != intString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }

}
