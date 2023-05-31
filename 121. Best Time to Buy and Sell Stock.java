T.C=O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            } else if(prices[i]-minPrice>maxProfit){
               maxProfit= prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}

//Explanation
In this code, we initialize maxProfit to 0 and minPrice to the maximum possible value.
We iterate over the prices array and update minPrice to the minimum value 
encountered so far. If the current price minus minPrice is greater than maxProfit,
we update maxProfit. Finally, we return the maxProfit.
Time Complexity
The time complexity of the `maximumProfit` method is O(n),