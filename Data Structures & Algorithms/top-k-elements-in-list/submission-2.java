class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        List<Integer> tmp = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m: list) {
            tmp.add(m.getKey());
            k--;
            if (k == 0) break;
        }
        int[] result = new int[tmp.size()];
        for (int i=0; i<tmp.size(); i++) {
            result[i] = tmp.get(i);
        }
        return result;
    }
}
