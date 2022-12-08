import java.util.*;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode pre = new ListNode(), head = pre;

        for (int i = 0; i < lists.length; i++) {
            ListNode cur = lists[i];
            while (cur != null) {
                pq.offer(cur.val);
                cur = cur.next;
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = new ListNode(pq.poll());
            pre.next = node;
            pre = pre.next;
        }
        return head.next;

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
