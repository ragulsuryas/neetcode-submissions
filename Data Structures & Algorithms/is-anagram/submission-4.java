class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len2 != len2) return false;
        int[] mp = new int[26];
        for (int i=0; i<len1; i++)
            mp[s.charAt(i)-'a']++;
        for (int i=0; i<len2; i++)
            mp[t.charAt(i)-'a']--;
        for (int i=0; i<26; i++) {
            if (mp[i] != 0) return false;
        }
        return true;
    }
}
