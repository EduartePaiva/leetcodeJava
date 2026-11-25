package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import leetcode.ReorderLinkedList.ListNode;

public class ReorderLinkedListTest {
    static final ReorderLinkedList s = new ReorderLinkedList();

    @Test
    void testReorderList() {
        ListNode head = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))));

        s.reorderList(head);

        int[] expected = { 2, 8, 4, 6 };

        for (int n : expected) {
            assertEquals(n, head.val);
            head = head.next;
        }

        assertNull(head);
    }
}
