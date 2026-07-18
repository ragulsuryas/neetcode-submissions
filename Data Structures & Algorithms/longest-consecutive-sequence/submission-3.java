class Solution {
    public int longestConsecutive(int[] nums) {
        int result=0;
        Set<Integer> set = new TreeSet<>();
        for (int n: nums)
            set.add(n);
        List<Integer> list = new ArrayList<>(set);
        int inc=0;
        for (int i=0; i<list.size(); i++) {
            if (i==0 || (list.get(i)-1 == list.get(i-1))) result = Math.max(result, ++inc);
            else inc=1;
        }
        return result;
    }
}
