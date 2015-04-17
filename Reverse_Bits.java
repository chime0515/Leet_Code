
public class Reverse_Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=1073741824;
		int n =1;
		System.out.println(reverseBits(n));
	}

	static public int reverseBits(int n) {
        int ans=0;
        
        for(int i=0; i<32; i++){
        	int bit = 0;
        	
        	if( (n&1) > 0){
        		
        		bit=1;
        	}
        	n=n>>1;

        	ans = ans*2 + bit;
        }

		return ans;
    }
}
