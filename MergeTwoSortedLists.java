public class MergeTwoSortedLists {
    public static void main(String[] args) {
        
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) { // iterative approach
        // In the end we have to return the head of the new list that's why we have to leave the head remained the same. So we need to create
        // a new ListNode called pointer to keep track with the list
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode head = new ListNode(0);
        ListNode pointer = head;
        while (list1!=null && list2!=null) {
            if (list1.val<=list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        if (list1!=null) pointer.next = list1;
        else pointer.next = list2;
        return head.next;
    }

    public static ListNode merge2Lists(ListNode list1, ListNode list2) {  // Recursion Approach (might cause stacks over flow)
        if (list1==null) return list2;
        if (list2==null) return list1;

        if (list1.val<=list2.val) {
            list1.next = merge2Lists(list1.next, list2);
            return list1;
        } else {
            list2.next = merge2Lists(list1, list2.next);
            return list2;
        }
    }
}

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
