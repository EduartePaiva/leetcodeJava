package leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import leetcode.LinkedListCycleDetection.ListNode;

public class LinkedListCycleDetectionTest {
    static final LinkedListCycleDetection s = new LinkedListCycleDetection();

    @Test
    void testHasCycle() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode tree = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = tree;
        tree.next = four;
        four.next = two;

        assertTrue(s.hasCycle(one));
    }
}
