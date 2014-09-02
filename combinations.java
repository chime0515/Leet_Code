import java.util.*;
public class combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4, k=2;
		ArrayList<ArrayList<Integer>> result=combine(n, k);
		System.out.println(result.toString());
	}
	
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp=new ArrayList<Integer>();
		helper(n, k, result, tmp, 1);
		return result;
	}

	public static void helper(int n, int k, ArrayList<ArrayList<Integer>> result,
			ArrayList<Integer> tmp, int start){
		
		if(tmp.size()==k){
			result.add(new ArrayList<Integer>(tmp));
			return;
		}
		else{
			for(int i=start; i<=n; i++){
				tmp.add(i);
				helper(n, k, result, tmp, i+1);
				tmp.remove(tmp.size()-1);
			}
			
		}
		
		
	}
}
