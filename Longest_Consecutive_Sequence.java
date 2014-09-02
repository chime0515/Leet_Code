import java.util.*;
public class Longest_Consecutive_Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={100,3,5,200,2,4};
		System.out.println(sol(A));
	}

	public static int sol(int[] num){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int maxLen=1;
        
        for(int i=0; i<num.length; i++)
        	map.put(num[i], 0);
        
        for(int i=0; i<num.length; i++){
        	if(map.get(num[i])==1)
        		continue;
        	
        	int tmp=num[i];
        	int curMax=1;
        	while(map.containsKey(tmp+1)){
        		curMax++;
        		tmp++;
        		map.put(tmp, 1);
        	}
        	
        	tmp=num[i];
        	while(map.containsKey(tmp-1)){
        		curMax++;
        		tmp--;
        		map.put(tmp, 1);
        	}
        	
        	maxLen=Math.max(maxLen, curMax);
        }
        
        return maxLen;
	}
}
