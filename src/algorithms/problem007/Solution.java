package algorithms.problem007;

/**
    Reverse digits of an integer.

        Example1: x = 123, return 321
        Example2: x = -123, return -321

    Note:
    The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

class Solution {

    public int reverse(int x) {
        String intString = Integer.toString(x);
        char firstChar = intString.charAt(0);
        StringBuilder reverseAbsoluteInteger = new StringBuilder();

        if (firstChar == '-') {
            reverseAbsoluteInteger.append(intString.substring(1));
        } else {
            reverseAbsoluteInteger.append(intString);
        }

        reverseAbsoluteInteger.reverse();

        int revInt;
        try {
            revInt = Integer.parseInt(reverseAbsoluteInteger.toString());
        }
        catch (NumberFormatException NFE) {
            return 0;
        }

        if (firstChar == '-') {
            reverseAbsoluteInteger.insert(0, '-');
            return revInt * -1;
        } else {
            return revInt;
        }
    }

}
