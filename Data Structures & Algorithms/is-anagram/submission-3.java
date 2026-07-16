class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len2 != len2) return false;
        int[] mp1 = new int[26];
        int[] mp2 = new int[26];
        for (int i=0; i<len1; i++)
            mp1[s.charAt(i)-'a']++;
        for (int i=0; i<len2; i++)
            mp2[t.charAt(i)-'a']++;
        for (int i=0; i<26; i++) {
            if (mp1[i] != mp2[i]) return false;
        }
        return true;
    }
}
