public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode node1 =new ListNode(2);
        ListNode node2 =new ListNode(3);
        ListNode node3 =new ListNode(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
    }

    public static ListNode swap(ListNode head) { 
        if (head==null || head.next==null) return head;

        ListNode second = head.next;
        ListNode third = head.next.next;

        second.next = head;
        head.next = swap(third);
        return second;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}