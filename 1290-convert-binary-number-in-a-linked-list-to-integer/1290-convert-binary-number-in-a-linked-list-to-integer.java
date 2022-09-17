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
    public int getDecimalValue(ListNode head) {
       int result=head.val;
        while(head.next!=null)
        {
         result=result*2+head.next.val;
            head=head.next;
        }   
        return result;
    }
}

/*ListNode t = head;
        int len = 0;
        while(t!=null)
        {
            len++;
            t = t.next;
        }
        // return len;
        int sum = 0;
        while(head!=null)
        {
            sum += head.val * Math.pow(2,--len);
            head = head.next;
        }
        return sum;*/