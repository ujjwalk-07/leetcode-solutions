/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int countA = 0;
        int countB = 0;
      while(temp1 != null){
        countA= countA + 1;
        temp1=temp1.next;

      }
      while(temp2 != null){
        countB= countB + 1;
        temp2=temp2.next;

      }
      
        // Reset pointers
        temp1 = headA;
        temp2 = headB;
      
      if(countA > countB){
        int diffA = countA-countB;
        for(int i=0;i<diffA;i++){
            temp1=temp1.next;
        }
      }
      if(countA<countB){
        int diffB = countB-countA;
        for(int i=0;i<diffB;i++){
            temp2=temp2.next;
        }
      }
      while(temp1 != null && temp2 != null){
      if(temp1== temp2){
      return temp1;
      }
      else{
      temp1=temp1.next;
      temp2=temp2.next;
      }
      }
      return null;
      /*
      while(temp1  != temp2){
        if()
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return temp1;
      */
    }
}