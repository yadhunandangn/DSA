// Best Time to Buy and Sell Stock
// Java solution goes here...

public class Best_Time_to_Buy_and_Sell_Stock{
    public int calculateMaxProfit (int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int price : prices)
        {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock bs = new Best_Time_to_Buy_and_Sell_Stock();
        int[] prices = {7,1,5,3,6,4};
        int result = bs.calculateMaxProfit(prices);
        System.out.println(result);
    }

}

