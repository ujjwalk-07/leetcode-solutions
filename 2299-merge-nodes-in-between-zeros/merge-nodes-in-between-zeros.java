
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode read = head.next;
        ListNode write = head;
        int sum = 0;

        while (read != null) {

            while (read != null && read.val != 0) {
                sum = sum + read.val;
                read = read.next;
            }

            if (read != null) {
                write.next = read;
                write = write.next;
                write.val = sum;
                sum = 0;
                read = read.next;
            }
        }

        return head.next;
    }
}
