package Problems;

public class Problem99 {

    public static void buyAndSellStock(int[] prices){
        int lsf = Integer.MAX_VALUE;
        int op=0;
        int pro = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < lsf){
                lsf=prices[i];
            }

            pro=prices[i]- lsf;

            if(pro>op){
                op=pro;
            }
        }
        System.out.println(op);
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
     
        buyAndSellStock(prices);
    }
    
}
