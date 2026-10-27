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

    
    public static ListNode reverse (ListNode head){
        ListNode curr = head;
        ListNode prev = null;
       
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev=curr;
            curr=forward;
        }
        return prev;
        }


    public ListNode doubleIt(ListNode head) {
                   //reverse ll 
                   head = reverse(head);
                   ListNode dummy = new ListNode(-1);
                   ListNode curr=dummy;
                   ListNode temp = head; 
                   int carry = 0 ;
       while(temp != null){
        int nodevalue = temp.val;
        int twotimes = 2*nodevalue + carry ;
        int digit = twotimes %10;
        temp=temp.next;
        //add to dummy
        curr.next = new ListNode(digit);
        curr=curr.next;
        carry=twotimes/10;
       }
       if(temp==null && carry != 0){
        curr.next = new ListNode(carry);
       }
      
      
       return reverse(dummy.next);
    }
}