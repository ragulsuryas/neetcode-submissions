class Solution {
    public int maxArea(int[] heights) {
        int res = -1;
        int ptr1 = 0;
        int ptr2 = heights.length - 1;
        while (ptr1 <= ptr2) {
            int tmp = Math.min(heights[ptr1], heights[ptr2]) * (ptr2 - ptr1);
            res = Math.max(res, tmp);
            if (heights[ptr1] < heights[ptr2]) {
                ptr1++;
            } else {
                ptr2--;
            }
        }
        return res;
    }
}
