import java.util.*;
public class subsets {

	public static void main(String[] args) {

		int[] S={1,2,3};
		ArrayList<ArrayList<Integer>> res=sol1(S);
		System.out.println(res.toString());

		res.clear();
		res=sol2(S);
		System.out.println(res.toString());
		
	}
	
	public static ArrayList<ArrayList<Integer>> sol2(int[] S){// recursion
		ArrayList<Integer> set=new ArrayList<Integer>();
		Arrays.sort(S);
		
		for(int i:S)
			set.add(i);
		
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		
		res=recur(set, 0);
		
		return res;
	}
	
	public static ArrayList<ArrayList<Integer>> recur(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> res;//=new ArrayList<ArrayList<Integer>>();
		
		if(set.size()==index){ // base case
			res=new ArrayList<ArrayList<Integer>>();
			res.add(new ArrayList<Integer>());
		}
		else{
			res=recur(set, index+1);
			int item=set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets=new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> al:res){
				ArrayList<Integer> newsubset=new ArrayList<Integer>();
				newsubset.addAll(al);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
		}
		
		return res;
	}
	
	
	public static ArrayList<ArrayList<Integer>> sol1(int[] S) { // think as DFS
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		
		if(S.length==0 || S==null)
			return res;
		
		res.add(new ArrayList<Integer>());
		Arrays.sort(S);
		
		for(int i:S){
			dfs(i, res);
		}
		
		return res;
    }
	
	public static void dfs(int i, ArrayList<ArrayList<Integer>> res){
		
		ArrayList<ArrayList<Integer>> tmpRes=new ArrayList<ArrayList<Integer>>();
		
		for(ArrayList<Integer> al:res){
			ArrayList<Integer> tmp=new ArrayList<Integer>(al);
			tmp.add(i);
			tmpRes.add(tmp);
			
		}
	
		for(ArrayList<Integer> al:tmpRes)
			res.add(al);
	}
}
