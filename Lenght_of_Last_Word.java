
public class Lenght_of_Last_Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World ";
		System.out.println(lengthOfLastWord(s));
	}

	   public static int lengthOfLastWord(String s) {
	        int ans=0;
	        int len=s.length()-1;
	        while(len>=0){
	            if(s.charAt(len)==' ' && ans==0){
	                //len--;
	            }
	            else if(s.charAt(len)==' '){
	                return ans;
	            }
	            else{
	                ans++;
	            }
	            len--;
	        }
	        return ans;
	    }
}
