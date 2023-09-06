package Problems;

public class Problem100 {
    //infinite transactions allowed
    public static void buyAndSellStock2(int [] prices){
        int bd=0;
        int sd =0;
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] >= prices[i-1]){
                sd++;
            }else{
                profit = prices[sd]-prices[bd];
                bd=sd=i;
            }
        }

        profit = prices[sd]-prices[bd];
        System.out.println(profit);
    }
    public static void main(String[] args){
        int[] prices = {1,2,3,4,5};
     
        buyAndSellStock2(prices);
    }
}
