class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String ss = new String(chars);
            hm.computeIfAbsent(ss, k -> new ArrayList<>()).add(s);
        }
        for (Map.Entry<String, List<String>> e : hm.entrySet()) {
            res.add(e.getValue());
        }
        return res;
    }
}
