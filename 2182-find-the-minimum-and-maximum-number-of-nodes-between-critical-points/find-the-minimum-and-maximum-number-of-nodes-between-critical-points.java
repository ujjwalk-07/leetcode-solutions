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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next ;
        int i =1;
        List<Integer> critical = new ArrayList<>();

        while(curr != null && curr.next != null){
            //for maxima
            if(curr.val > prev.val && curr.val > curr.next.val){
                critical.add(i);

            }
            if(curr.val < prev.val && curr.val <curr.next.val){
                critical.add(i);
            }
            curr=curr.next;
            prev=prev.next;
            i++;

        }
        if(critical.size()<2){
            return new int[]{-1,-1};
        }
        //critical points ki list ready hai
        int Mindistance = Integer.MAX_VALUE ;

        for( i =1;i<critical.size();i++){
            Mindistance = Math.min(Mindistance ,critical.get(i)-critical.get(i-1));

        }

        int maxd = critical.get(critical.size()-1) - critical.get(0);

        return new int[]{Mindistance , maxd};
    }
}