class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int res=0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                res = Math.max(res, prices[j]-prices[i]);
            }
        }
        return res;
    }
}
