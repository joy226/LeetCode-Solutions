class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if a new lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Check profit if we sold at current price
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;

    }
}