using System.Text.RegularExpressions;
public class Solution {
    public bool WordPattern(string pattern, string s) {
        Hashtable hashtable = new Hashtable();
        string[] strings = Regex.Split(s, " ");
        char pat;
        if (pattern.Length != strings.Length) return false;
        for (int i = 0; i < pattern.Length; i++)
        {
            pat = pattern[i];
            if (hashtable.ContainsKey(pat))
            {
                if ((string)hashtable[pat] != strings[i])
                {
                    return false;
                }
            }
            else if (!hashtable.ContainsValue(strings[i]))
            {
                hashtable.Add(pat, strings[i]);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
