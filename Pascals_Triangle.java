import java.util.*;
public class Pascals_Triangle {

	public static void main(String[] args) {
		
		int numRows=5;	
		ArrayList<ArrayList<Integer>> al=generate(numRows);
		System.out.println(al.get(numRows-1));
		
	}

	static public ArrayList<ArrayList<Integer>> generate(int numRows) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(numRows<=0) return result;
		
		ArrayList<Integer> pre=new ArrayList<Integer>(); 
		pre.add(1);
		result.add(pre);
		
		for(int i=2; i<=numRows; i++){
			ArrayList<Integer> tmp=new ArrayList<Integer>();
			tmp.add(1);
			
			for(int j=0; j<pre.size()-1; j++){
				tmp.add(pre.get(j)+pre.get(j+1));
			}
			tmp.add(1);
			
			pre=tmp;
			result.add(tmp);			
		}

		
		
        return result;
    }
}
