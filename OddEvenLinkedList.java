public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        oddEvenList(head);
        System.out.println(node2.next.val);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head==null) return null;
        ListNode odd = head;    // head is the odd head;  odd is the pointer of odd list
        ListNode even = head.next;  //even is the pointer of even list
        ListNode evenHead = even; // Create head of even list

        // the idea is to use 2 pointer (aka odd, even) to traverse the linked list, each round the pointers will link their current node
        // that they point at to the next revelant node and at the end, we have 2 separate list of odd and even 
        // Finally, link 2 list together, by linking the last node of a list to the head of one another. 
        // In this case we link the last node of odd list to the even head

        while (even!=null && even.next!=null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}