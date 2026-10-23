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
    public ListNode sortList(ListNode head) {
        return divide(head);
    }
    public ListNode divide(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = findMid(head);
        ListNode secondHalf = mid.next;
        mid.next = null;
        ListNode first = divide(head);
        ListNode second = divide(secondHalf);
        return merge(first, second);
    }
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode();
        ListNode curr = l3;
        while(list1 != null && list2 != null) {
            if(list1.val >= list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
               curr.next = list1;
               list1 = list1.next;
            }
            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
        }
        
        if(list2 != null) {
            curr.next = list2;
        }
        return l3.next;
    }
}