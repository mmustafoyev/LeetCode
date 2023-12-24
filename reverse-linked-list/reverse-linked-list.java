/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode result = null;
    private ListNode rs = null;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        reverseList(head.next);
        if(head.next == null) {
            result = head;
            rs = result;
        }
        else {
            result.next = head;
            result = result.next;
            head.next = null;
        }

        return rs;
    }
}