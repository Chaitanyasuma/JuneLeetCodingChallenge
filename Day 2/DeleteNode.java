/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr = node;
        ListNode prev = ptr;
        while (ptr.next != null) {
            ptr.val = ptr.next.val;
            prev = ptr;
            ptr = ptr.next;
        }
        //reached last node, delete it completely
        prev.next = null;
    }
}