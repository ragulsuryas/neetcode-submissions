class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for (String ss: strs) {
            s += ss.length() + "#" + ss;
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i=0;
        while (i < str.length()) {
            String s = new String();
            while (str.charAt(i) != '#')
                s += str.charAt(i++);
            Integer n = Integer.parseInt(s);
            arr.add(str.substring(++i, i+n));
            i = i+n;
        }
        return arr;
    }
}
