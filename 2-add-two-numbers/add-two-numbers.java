class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node answer list banane ke liye
        ListNode result = new ListNode(0);

        // Current pointer answer list me
        ListNode current = result;

        int carry = 0;

        // Jab tak koi bhi list bachi hai ya carry bacha hai
        while (l1 != null || l2 != null || carry != 0) {

            int x = 0;
            int y = 0;

            if (l1 != null) {
                x = l1.val;
            }

            if (l2 != null) {
                y = l2.val;
            }

            int sum = x + y + carry;

            carry = sum / 10;

            int digit = sum % 10;

            current.next = new ListNode(digit);

            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return result.next;
    }
}