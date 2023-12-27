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
    public ListNode reverseList(ListNode head) {
        return reversed(null, head);
    }
    public ListNode reversed(ListNode prev, ListNode current){
        if(current == null){
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return reversed(current, next);
    }
}