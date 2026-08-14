public static int maxProfit(int[] prices){
        int minPrice = 10000;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit , profit);
        }
        return maxProfit;
    }
