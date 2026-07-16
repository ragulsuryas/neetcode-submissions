class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        int[] result = new int[n];
        Arrays.fill(prefix, 1);
        Arrays.fill(sufix, 1);
        int product = 1;
        for (int i=1; i<n; i++) {
            product *= nums[i-1];
            prefix[i] = product;
        }
        product = 1;
        for (int i=n-2; i>=0; i--) {
            product *= nums[i+1];
            sufix[i] = product;
        }
        for(int i=0; i<n; i++) {
            result[i] = prefix[i] * sufix[i];
        }
        return result;
    }
}  
