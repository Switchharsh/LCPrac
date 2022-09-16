/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class LC876 {
    class Solution {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode middleNode(ListNode head) {

            ListNode a = head, b = head;
            while (a.next != null && a != null) {
                a = a.next.next;
                b = b.next;
            }
            return b;

        }
    }
}
