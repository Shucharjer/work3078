public class Solution {
    public int LengthOfLastWord(string s) {
        int len = 0;
        bool flag = false;
        for (int i = s.Length - 1; i >= 0; i--)
        {
            if (s[i] == ' ')
            {
                if (flag)
                {
                    break;
                }
            }
            else
            {
                flag = true;
                len += 1;
            }
        }
        return len;
    }
}
