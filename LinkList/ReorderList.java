class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next; // find middle part
        }

        ListNode right = slow.next; // remember right part beginning
        slow.next = null;

        ListNode current = right;
        ListNode prev = null;
        ListNode rightHead = reverse(current, prev);

        ListNode left = head;
        ListNode temp;

        while (rightHead != null) {
            temp = left.next;
            left.next = rightHead;
            rightHead = rightHead.next;
            left.next.next = temp;
            left = temp;
        }
    }

    public ListNode reverse(ListNode current, ListNode prev) {
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
