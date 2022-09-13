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
    public ListNode middleNode(ListNode head) {
     int l=0;
    ListNode p = head;
    while (p != null) {
        p = p.next;
        l = l + 1;
    }
    p = head;
    int c = 0;
    while (c < l/2) {
        p = p.next;
        c = c + 1;
    }
    return p;
    }
}