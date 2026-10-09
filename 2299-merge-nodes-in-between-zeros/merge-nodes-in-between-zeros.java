
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode read = head.next;
        ListNode write = head;
       // int sum = 0;

        while (read != null) {
            int sum = 0 ;

            while ( read.val != 0) {
                sum = sum + read.val;
                read = read.next;
            }

          
               
                write.val = sum;
                write.next=read.next;
                
                read = read.next;
                write=write.next;
            }
        

        return head;
    }
}
