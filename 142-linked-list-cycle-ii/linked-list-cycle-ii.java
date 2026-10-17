/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = slow;
        boolean hascycle = false;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next ;
                slow = slow.next ;
            }
            if(fast == slow){
                hascycle = true;
                break;
            }
        }
        if(hascycle == false){
            return null;
        }
        slow = head; 
        while(slow != fast){
            slow = slow.next;
            fast=fast.next;
        }
        ListNode starting = fast ;
        return fast;
    }
}