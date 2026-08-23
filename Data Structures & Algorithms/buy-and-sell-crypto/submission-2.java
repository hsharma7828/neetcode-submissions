class Solution {
    public int maxProfit(int[] prices) {
        // int minPrice = prices[0];
        int left = 0, right = 1;
        int maxProfit = 0;


        // for(int i =1; i< prices.length ; i++) {
        //     int currentPrice = prices[i] - minPrice;

        //     maxProfit = Math.max(maxProfit, currentPrice);
        //     minPrice = Math.min(minPrice, prices[i]);
        // }

        //WITH TWO POINTER
        while (right < prices.length) {
            if(prices[left] <= prices[right]) {
                int profit = prices[right] - prices[left];

                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
    return maxProfit;

    }
}
