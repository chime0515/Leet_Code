
public class Maximum_Product_Subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProduct(int[] A) {
        if(A==null)
            return 0;
        
        int max=A[0], min=A[0], ans=A[0];
        
        
        for(int i=1; i<A.length; i++){
            int mx=max, mn=min;
            max=Math.max(A[i], Math.max(mx * A[i], mn * A[i]));
            min=Math.min(A[i], Math.min(mx * A[i], mn * A[i]));
            ans=Math.max(ans, max);
        }
        
        return ans;
    }
}
