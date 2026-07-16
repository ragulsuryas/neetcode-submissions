class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        int count = 0;
        for (int num: nums) {
            if (num != 0) product *= num;
            else count++;
        }
        int i = 0;
        for (int num: nums) {
            if (count > 1) res[i++] = 0;
            else if (count == 1 && num == 0) res[i++] = product;
            else if (count == 1) res[i++] = 0;
            else res[i++] = product/num;
        }
        return res;
    }
}  
