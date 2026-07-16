class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chr1 = s.toCharArray();
        char[] chr2 = t.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        s = new String(chr1);
        t = new String(chr2);
        return s.equals(t);
    }
}
