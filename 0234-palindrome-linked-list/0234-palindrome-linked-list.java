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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        ListNode l = fast;
        while(l.next!=slow){
            l = l.next;
        }
        l.next = null;
        ListNode fr = slow;
        ListNode pr = null;
        ListNode cr = slow;
        while(fr!=null){
            fr = fr.next;
            cr.next = pr;
            pr = cr;
            cr = fr;
        }
        slow = pr;
        while(slow!=null && fast!=null){
            if(fast.val !=slow.val){
                return false;
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        // l.next = slow;
        return true;
    }
}