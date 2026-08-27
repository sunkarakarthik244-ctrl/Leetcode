class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;

        





        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<=prices.length-1;j++){
        //         if(prices[i]<prices[j]){
        //             int absval=Math.abs(prices[i]-prices[j]);
        //             max=Math.max(max,absval);
        //         }
        //     }
        // }
        // return max;
        
    }
}