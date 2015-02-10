
public class Valid_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" .1 ";
		System.out.println(isNumber(s));
	}

	public static boolean isNumber(String s) {
        int len = s.length();
        int i=0;
        
        boolean isNumber=false;
        
        while(i<len && Character.isWhitespace(s.charAt(i)))
        	i++;
        
        if(i<len && s.charAt(i)=='+' || s.charAt(i)=='-')
        	i++;
        	
        while(i<len && Character.isDigit(s.charAt(i))){
        	isNumber=true;
        	i++;
        }
        
        if(s.charAt(i)=='.'){
    		i++;
    		while(i<len && Character.isDigit(s.charAt(i))){
    			i++;
    			isNumber=true;
    		}
    	}
        
        while(i<len && Character.isWhitespace(s.charAt(i)))
        	i++;
     
        return i==len && isNumber;
    }
}
