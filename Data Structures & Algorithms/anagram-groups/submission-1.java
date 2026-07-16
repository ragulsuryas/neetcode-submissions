class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s: strs) {
            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String tmp = new String(chr);
            if (mp.containsKey(tmp)) {
                mp.get(tmp).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                mp.put(tmp, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(mp.values());
        return res;
    }
}
