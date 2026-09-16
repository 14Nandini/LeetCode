class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0], currProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy) buy = prices[i];
            else currProfit = prices[i] - buy;
            maxProfit = Math.max(currProfit, maxProfit);
        }
        return maxProfit;
    }
}