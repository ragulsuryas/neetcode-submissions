class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num: nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int i = 0;
        for (var pair: list) {
            res[i++] = pair.getKey();
            if (i == k) return res;
        }
        return res;
    }
}
