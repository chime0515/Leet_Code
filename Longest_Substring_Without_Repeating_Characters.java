import java.util.Arrays;

public class Longest_Substring_Without_Repeating_Characters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(sol2_bad(s));
	}

	//O(n), 2 iteration
	public static int sol2_bad(String s){
		boolean[] exist=new boolean[256];
		int maxlen=0;
		int index=0;
		
		Arrays.fill(exist, false);

		for(int i=0; i<s.length(); i++){
			while(exist[s.charAt(i)]){
				exist[s.charAt(index)]=false;
				index++;
			}
			
			exist[s.charAt(i)]=true;
			maxlen=Math.max(maxlen, i-index+1);
		}
		
		return maxlen;
		
	}
	
	
	//O(n), 1 iteration
	public static int lengthOfLongestSubstring(String s) {

		int[] map=new int[256];
		Arrays.fill(map, -1);
		int last_position=0;
		int maxlen=0;
		
		for(int i=0; i<s.length(); i++){
			if(map[s.charAt(i)]>=last_position){
				last_position=map[s.charAt(i)]+1;
			}
			map[s.charAt(i)]=i;
			maxlen=Math.max(maxlen, i-last_position+1);
		}
		
		return maxlen;
	}
}

