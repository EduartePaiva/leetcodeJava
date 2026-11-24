package leetcode;

public class LinkedListCycleDetection {

    public static class ListNode {
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

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        var oneStep = head;
        var twoStep = head;

        while (true) {
            oneStep = oneStep.next;
            twoStep = twoStep.next;
            if (twoStep != null) {
                twoStep = twoStep.next;
            }

            if (oneStep == null || twoStep == null) {
                break;
            }

            if (oneStep == twoStep) {
                return true;
            }
        }

        return false;
    }

}
