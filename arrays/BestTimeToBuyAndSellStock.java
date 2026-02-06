class Solution {
    public int maxProfit(int[] prices) {
        int currentPrice=prices[0];
        int maxprice=0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i] < currentPrice){
                currentPrice = prices[i];
            }
            else{
                int profit = prices[i] - currentPrice;
                if(maxprice < profit){
                    maxprice= profit;
                }
            }

        }
        return maxprice;
    }
}
