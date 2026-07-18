class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String ss: strs) {
            s.append(ss.length());
            s.append("#");
            s.append(ss);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i=0;
        while (i < str.length()) {
            int j=i;
            while (str.charAt(j) != '#')
                j++;
            Integer n = Integer.parseInt(str.substring(i, j));
            j += 1;
            arr.add(str.substring(j, j+n));
            i = j+n;
        }
        return arr;
    }
}
