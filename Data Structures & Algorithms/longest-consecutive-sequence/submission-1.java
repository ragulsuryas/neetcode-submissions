class Solution {
    public int longestConsecutive(int[] nums) {
        int max = -1;
        int min = 10000;
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
            set.add(n);
        }
        int inc = 0;
        for (int i=min; i<max+1; i++) {
            if (set.contains(i)) res = Math.max(res, ++inc);
            else inc=0;
        }
        return res;
    }
}
