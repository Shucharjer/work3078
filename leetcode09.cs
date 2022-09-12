public class Solution {
    public bool IsPalindrome(int x) {
        if (x < 0) //因为负号的存在，只要是负数就不是回文数
        {
            return false;
        }
        else
        {
            int length = x.ToString().Length; int y = 0;
            for (int i = 0; i < length / 2; i++)
            {
                y = y * 10 + x % 10;
                x /= 10;
            }
            if (length % 2 == 1)
            {
                x = x / 10;
            } //长度为奇数时忽略最中间的数
            if (y != x)
            {
                return false;
            } //把x倒过来一半进行对比
            return true;
        }
    }
}
