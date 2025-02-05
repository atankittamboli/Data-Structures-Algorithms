package array;

public class BuyandSellStock {

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};		
		int profit  = maxProfit(prices);
		System.out.println(profit);
	}
	
	public static int maxProfit(int[] prices) {
        
		int minVal = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price<minVal) {
				minVal = price;
			}else {
				maxProfit = Math.max(maxProfit, price-minVal);
			}
		}
		
		return maxProfit;
    }
}
