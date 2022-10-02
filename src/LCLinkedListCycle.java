public class LCLinkedListCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;

        }
    }
    public class Solution {

        public boolean hasCycle(ListNode head) {
            ListNode normal = head, fast = head;
            if (head.next == null || head == null) return false;

            while(normal.next != null && fast.next.next!=null) {
                normal = normal.next;
                fast = fast.next.next;
                if (normal == fast) {
                    return true;
                }
            }
                return false;
        }
    }
}
