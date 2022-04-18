

class BestTimeBuySellStock {
	
    public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
    
    public static void main(String[] args) {
		int[] test1 = {7,1,5,3,6,4};
		/*Explanation: Buy on day 2 (price = 1) 
		 * and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger 
             than buying price.
		 * */
		int[] test2 = {7,6,4,3,1};
		/*In this case, no transaction is done, 
		 * i.e. max profit = 0.
		 * */
		System.out.println(maxProfit(test1));
		System.out.println(maxProfit(test2));
		
	}
}
