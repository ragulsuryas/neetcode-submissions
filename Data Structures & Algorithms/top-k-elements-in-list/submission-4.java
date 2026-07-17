class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num: nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(hm.entrySet());
        ls.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int[] res = new int[k];
        int i=0;
        for(Map.Entry<Integer, Integer> entry: ls) {
            res[i++] = entry.getKey();
            if (i == k) break;
        }
        return res;
    }
}
