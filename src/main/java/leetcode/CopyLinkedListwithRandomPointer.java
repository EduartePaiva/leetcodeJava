package leetcode;

import java.util.HashMap;

public class CopyLinkedListwithRandomPointer {
    static private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    private HashMap<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        var tail = head;

        while (tail != null) {
            map.put(tail, new Node(tail.val));
            tail = tail.next;
        }
        tail = head;

        while (tail != null) {
            var node = map.get(tail);
            node.next = map.get(tail.next);
            node.random = map.get(tail.random);
            tail = tail.next;
        }

        return map.get(head);
    }

}
