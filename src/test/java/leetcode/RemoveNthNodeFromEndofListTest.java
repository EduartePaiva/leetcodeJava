package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import leetcode.RemoveNthNodeFromEndofList.ListNode;

public class RemoveNthNodeFromEndofListTest {
    static final RemoveNthNodeFromEndofList s = new RemoveNthNodeFromEndofList();

    @Test
    void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        int[] expected = { 1, 2, 4 };

        head = s.removeNthFromEnd(head, 2);

        for (int n : expected) {
            assertEquals(n, head.val);
            head = head.next;
        }
        assertNull(head);
    }

    @Test
    void testRemoveNthFromEnd2() {
        ListNode head = new ListNode(5);

        head = s.removeNthFromEnd(head, 1);

        assertNull(head);
    }
}
