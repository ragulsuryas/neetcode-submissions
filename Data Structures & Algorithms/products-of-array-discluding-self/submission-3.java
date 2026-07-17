class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        int p = 1;
        for (int i=0; i<n; i++) {
            p *= nums[i];
            prefix[i] = p; 
        }
        p = 1;
        for (int i=n-1; i>=0; i--) {
            p *= nums[i];
            suffix[i] = p; 
        }
        for (int i=1; i<n-1; i++) {
            p *= nums[i];
            result[i] = prefix[i-1] * suffix[i+1]; 
        }
        result[n-1] = prefix[n-2];
        result[0] = suffix[1];
        return result;
    }
}  
