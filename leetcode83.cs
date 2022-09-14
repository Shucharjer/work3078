/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode DeleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        else if (head.val != head.next.val)
        {
            head.next = DeleteDuplicates(head.next);
            return head;
        }
        else
        {
            do
            {
                head = head.next;
            }while (head.next != null && head.val == head.next.val);
            if (head.next != null)
            {
                head.next = DeleteDuplicates(head.next);
                return head;
            }
            else 
            {
                return head;
            }
        }
    }
}
