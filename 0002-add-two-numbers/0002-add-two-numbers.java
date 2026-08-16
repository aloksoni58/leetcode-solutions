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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum = 0;
        int carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = null;//stores actual result's head
        ListNode ptr = null;//pointer to next node
        while(p1 != null || p2 != null) {
            int val1 = p1 != null ? p1.val : 0;;
            int val2 = p2 != null ? p2.val : 0;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            int value = sum % 10;
            ListNode temp = new ListNode(value);
            if(res == null) {
                res = temp;
                ptr = temp;
            } else {
                ptr.next = temp;
                ptr = ptr.next;
            }

            if(p1 != null) {
                p1 = p1.next;
            }
            if(p2 != null) {
                p2 = p2.next;
            }
        }

        if(carry > 0) {
            ptr.next = new ListNode(carry);
        }
        return res;
    }
}