import java.util.*;


public class Roman_to_Integer {

	public static void main(String[] args) {
		
		String s="MCMXCVI";

		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		int ans=0;
		char[] c = new char[] { 'M', 'D', 'C', 'L', 'X', 'V','I' };
        int[] val = new int[] { 1000, 500, 100, 50, 10, 5, 1};
        
        HashMap<Character, Integer> m=new HashMap<Character, Integer>();
        
        for(int i=0; i<c.length; i++)
        	m.put(c[i], val[i]);

        
        for(int i=0; i<s.length(); i++){
        	int tmp=m.get(s.charAt(i));
        	if(i==s.length()-1 || tmp>=m.get(s.charAt(i+1))){
        		ans+=tmp;
        	}
        	else{
        		ans-=tmp;
        	}
        }
        
		
		return ans;
	}

}
