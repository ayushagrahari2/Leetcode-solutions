class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int price =0 ;

        for(int i=0; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            price = Math.max(price, prices[i] - buy);
        }
        return price;
    }
}