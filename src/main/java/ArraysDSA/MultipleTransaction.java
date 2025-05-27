package ArraysDSA;

/*
given an array prices[] of size n denoting the cast on each day, the task is to find the maximum total profit if we can buy
and sell the stocks any no.of times.
 */

public class MultipleTransaction {
    static int maximumProfit(int[] prices){
        int res = 0;

        //keep on adding the difference between adjacent when the prices

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {100,180,260,310,40,535,695};
        System.out.println(maximumProfit(prices));
    }
}
