
public class Best_Time_Buy_and_Sell_Stock_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A={1,5,7,2,3,7,1};

		System.out.println(maxProfit(A));
	}
    static public int maxProfit(int[] A) {
        int p=0;
        for(int i=0; i<A.length-1; i++){
            if(A[i]<A[i+1])
                p=p+A[i+1]-A[i];
        }
        
        return p;
    }
}
