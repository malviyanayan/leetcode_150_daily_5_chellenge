import java.util.HashSet;

class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}