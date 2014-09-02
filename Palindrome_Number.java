
public class Palindrome_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1011;
		System.out.println(isPalindrome(x));
	}

    public static boolean isPalindrome(int x) {
    	if(x<0) return false;
    	int div=1;
        while(x/div>=10){
            div*=10;
        }
        
        while(x>0){
            int l=x/div;
            int r=x%10;
            if(l!=r) 
                return false;

            x = (x % div) / 10;            
            div /= 100;
        }
        
        return true;
    }
}
