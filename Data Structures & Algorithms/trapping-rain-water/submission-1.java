class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int max=0, result=0;
        for (int i=0; i<n; i++) {
            prefix[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        for (int i=n-1; i>=0; i--) {
            suffix[i] = max;
            max = Math.max(max, height[i]);
        }
        for (int i=0; i<n; i++) {
            int num = Math.min(prefix[i], suffix[i]) - height[i];
            if (num > 0) result += num;
        }
        return result;
    }
}
