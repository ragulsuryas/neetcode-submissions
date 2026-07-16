class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        for (char c: s.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) 
                res += c;
        }
        String reversed = "";
        char[] chrs = res.toCharArray();
        for (int i=chrs.length-1; i>=0; i--) {
            reversed += chrs[i];
        }
        return res.toUpperCase().equals(reversed.toUpperCase());
    }
}
