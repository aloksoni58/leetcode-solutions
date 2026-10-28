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
    public ListNode reverseBetween(ListNode head, int x, int y) {
        
        ListNode leftPrev = null, left = head;
        ListNode rightNext = head, right = null;

        for(int i = 1; i < x; i++) {
            leftPrev = left;
            left = left.next;
        }

        for(int i = 1; i <= y; i++) {
            right = rightNext;
            rightNext = rightNext.next;
        }

        right.next = null;

        ListNode p = null, c = left, n = null;
        while(c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n; 
        }
        if(leftPrev != null)
            leftPrev.next = right;
        else
            head = right;
        while(p.next != null) {
            p = p.next;
        }
        left.next = rightNext;

        return head;
    }
}