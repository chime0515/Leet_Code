
public class Best_Time_Buy_Sell_Stock {

	public static void main(String[] args) {
		int[] prices={2,1,2,1,0,1,2};
		int p=maxProfit(prices);
		System.out.println(p);
	}
    
	static public int maxProfit(int[] prices) {
		if(prices.length<=1) return 0;

	       int min=Integer.MAX_VALUE;
	       int diff=0;
	       
	       for (int i=0; i<prices.length; i++){
	           if (prices[i]<min){
	               min=prices[i];
	           }    
	           
	           if (diff<prices[i]-min){
	               diff=prices[i]-min;
	           }
	       }
	       
	       return diff;
        
    }
}
