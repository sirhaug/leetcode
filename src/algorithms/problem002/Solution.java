package algorithms.problem002;

/**
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
 */

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode prevNode = null;
        int carry = 0;

        // Assume that l1 and l2 have the same length.
        while (temp1 != null && temp2 != null) {
            int val;
            int tempVal = temp1.val + temp2.val + carry;

            if (tempVal > 9) {
                val = tempVal % 10;
                carry = (tempVal - val) / 10;
            }
            else {
                val = tempVal;
            }

            ListNode thisNode = new ListNode(val);
            if (firstNode == null) {
                firstNode = thisNode;
            }
            else {
                prevNode.next = thisNode;
            }
            prevNode = thisNode;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return firstNode;

    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
