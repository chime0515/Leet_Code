public class Longest_Palindromic_Substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abacdfgdcaba";
		System.out.println(longestPalindrome(s));
		
		System.out.println(2001%1000);
	}

	public static String longestPalindrome(String s) {
        if(s==null || s.length()==0)
            return "";
            
        int maxlen=0;
        String res="";
        
        for(int i=0; i<2*s.length()-1; i++){
            int l=i/2, r=i/2;
            if(i%2==1)  
                r++;
            String tmp = getPalindromeString(s, l, r);
            if(tmp.length() > maxlen){
                maxlen=tmp.length();
                res=tmp;
            }
        }
        
        return res;
    }
    
    public static String getPalindromeString(String s, int left, int right){

        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        
        return s.substring(left+1, right);
    }
}
