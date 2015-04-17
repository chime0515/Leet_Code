
public class Number_of_1_Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(hammingWeight(n));
	}

	 static public int hammingWeight(int n) {
	        int count=0;
	        
	        for(int i=0; i<32; i++){
	            if( (n&1)>0)
	                count++;
	            n=n>>1;
	        }
	        
	        return count;
	    }
}
