class Solution {
    public boolean isPalindrome(ListNode head) {
        int[] num = new int[100000];
        int c = 0;
        for ( ; ; c++)
        {
            num[c] = head.val;
            if (head.next != null)
            {
                head = head.next;
            }
            else 
            {
                break;
            }
        }
        for (int i = 0; i < c / 2 + 1; i++)
        {
            if (num[i] != num[c - i])
            {
                return false;
            }
        }
        return true;
    }
}
