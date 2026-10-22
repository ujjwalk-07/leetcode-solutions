class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // Step 1: Count total nodes
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: Calculate size of each part
        int size = len / k;
        int extra = len % k;

        // Step 3: Create answer array
        ListNode[] ans = new ListNode[k];

        // Step 4: Split the linked list
        ListNode curr = head;

        for (int i = 0; i < k; i++) {

            // Store the starting node of this part
            ans[i] = curr;

            // Calculate nodes in current part
            int partSize = size;

            if (extra > 0) {
                partSize++;
                extra--;
            }

            // Move to the last node of current part
            for (int j = 1; j < partSize; j++) {
                if (curr != null) {
                    curr = curr.next;
                }
            }

            // Disconnect current part
            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return ans;
    }
}