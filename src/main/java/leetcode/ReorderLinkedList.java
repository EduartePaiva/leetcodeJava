package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderLinkedList {

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

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        Deque<ListNode> deq = new ArrayDeque<>();

        while (head != null) {
            deq.push(head);
            head = head.next;
        }

        head = deq.removeLast();
        var tail = head;
        boolean first = true;

        while (!deq.isEmpty()) {
            if (first) {
                tail.next = deq.removeFirst();
            } else {
                tail.next = deq.removeLast();
            }

            first = !first;
            tail = tail.next;

        }
        tail.next = null;
    }

}
