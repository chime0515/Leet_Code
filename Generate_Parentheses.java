import java.util.*;
public class Generate_Parentheses {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al=generateParenthesis(3);
		System.out.println(al);
		
	}

	static public ArrayList<String> generateParenthesis(int n){
		
		ArrayList<String> result=new ArrayList<String>();
		
		sol(n, 0, 0, result, "" );
		
		return result;
		
	}

    static public void sol(int n, int l, int r, ArrayList<String> result, String s){
    	// all ( appear: exit
    	if(l==n){
    		for(int i=0; i<n-r; i++){
    			s=s+")";
    		}
    		result.add(s);
    		return;
    	}
 
    	// case 1: ( > )
    	if(l>r){
    		sol(n, l+1, r, result, s+"(");
    		sol(n, l, r+1, result, s+")");
    	}
    	//case 2: ( == )
    	else{
    		sol(n, l+1, r, result, s+"(");
    	}
    	
    }

}
