
public class BestTimeToBuyAndSellStock {
	
    public int maxProfit(int[] prices) {
    	int minPrice = prices[0];
    	int maxProf = 0;
    	
    	for(int i=0; i < prices.length; i++) {
    		maxProf = Math.max(maxProf, prices[i]- minPrice);
    		minPrice = Math.min(minPrice, prices[i]);
    	}
    	return maxProf;
    }

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
		int[] prices = {7,1,5,3,6,4}; 
		System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
		
	}

}
