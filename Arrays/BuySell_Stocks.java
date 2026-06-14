public class BuySell_Stocks {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else {
                profit = Math.max(profit, price - minprice);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
         BuySell_Stocks obj = new BuySell_Stocks();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
    
