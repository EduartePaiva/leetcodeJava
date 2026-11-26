package leetcode;

public class RemoveNthNodeFromEndofList {

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private int backtrack(ListNode node, int n) {
        if (node == null) {
            return 0;
        }

        int depth = backtrack(node.next, n);

        if (depth == n) {
            node.next = node.next.next;
        }

        return depth + 1;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 1. invert list, remove nth node and revert back
        // 2. do a backtrack solution
        ListNode dummy = new ListNode();
        dummy.next = head;

        backtrack(dummy, n);

        return dummy.next;
    }
}
