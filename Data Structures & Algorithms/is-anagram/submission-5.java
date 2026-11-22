class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] mp1 = new int[26];
        int[] mp2 = new int[26];
        for (char c: s.toCharArray())
            mp1[c-'a']++;
        for (char c: t.toCharArray())
            mp2[c-'a']++;
        for (int i=0; i<26; i++) {
            if (mp1[i] != mp2[i]) return false;
        }
        return true;
    }
}
