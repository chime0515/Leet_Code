public class Find_Minimum_in_Rotated_Sorted_Array_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] A) {
		if(A==null || A.length==0)
            return 0;
        
        int l=0, r=A.length-1, min=A[0];
        
        while(l<r-1){
            int m=l+(r-l)/2;
            
            if(A[m]>A[l]){
                min=Math.min(min, A[l]);
                l=m+1;
            }
            else if(A[m]<A[l]){
                min=Math.min(A[m], min);
                r=m-1;
            }
            else
                l++;
        }
        
        
        min=Math.min(min, A[l]);
        min=Math.min(min, A[r]);
        return min;
	}
}
