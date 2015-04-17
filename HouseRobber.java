
public class HouseRobber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int rob(int[] num) {
	        if(num==null || num.length==0)
	            return 0;

	        if(num.length==1)
	        	return num[0];
	        
	        int[] ans = new int[num.length];
	        ans[0] = num[0];
	        ans[1] = Math.max(num[0], num[1]);
	        
	        for(int i=2; i<num.length; i++){
	            ans[i] = Math.max(ans[i-2]+num[i], ans[i-1]);
	        }
	        
	        return ans[num.length-1];
	        
	    }
}
