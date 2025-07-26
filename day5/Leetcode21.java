class Leetcode21 {
    ListNode temp = null;

    ListNode insert(int val, ListNode head) {
        ListNode node = new ListNode(val, null);

        if (head == null) {
            head = temp = node;
        } else {
            temp.next = node;
            temp = node;
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head = insert(list1.val, head);
                list1 = list1.next;
            } else {
                head = insert(list2.val, head);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            head = insert(list1.val, head);
            list1 = list1.next;
        }

        while (list2 != null) {
            head = insert(list2.val, head);
            list2 = list2.next;
        }

        return head;
    }
}

class ListNode {
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