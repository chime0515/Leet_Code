import java.util.*;
public class Valid_Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()";
		System.out.println(sol(s));
	}

	public static boolean sol(String s){
		Hashtable<Character, Character> map=new Hashtable<Character, Character>();
		Stack<Character> st=new Stack<Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		
		for(int i=0; i<s.length(); i++){
			char cur=s.charAt(i);
			if(map.containsKey(cur)){
				st.push(cur);
			}
			else if(map.values().contains(cur)){
				if(!st.isEmpty() && map.get(st.peek())==cur){
					st.pop();
				}
				else
					return false;
			}	
		}
		
		if(st.isEmpty()) return true;
		else return false;
	}
}
