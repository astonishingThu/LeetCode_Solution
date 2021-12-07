public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
    }

    public static int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head!=null) {
            sum*=2;
            sum+=head.value;
            head = head.next;
        }
        return sum;
    }
}
 // https://leetcode.com/problems/minimum-distance-between-bst-nodes/discuss/906554/simple-logic-java-faster-than-100
class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
    }
}
