import java.util.ArrayList;


public class Permutation {

	public static void main(String[] args) {
	
		int[] num={1,2,3};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		result=permute(num);
		for(int i=0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}

	static public ArrayList<ArrayList<Integer>> permute(int[] num) {	
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		sol(num, 0, result);
		return result;
    }
	static public void sol(int[] num, int b, ArrayList<ArrayList<Integer>> result){
		if(b==num.length-1){
			ArrayList<Integer> al=new ArrayList<Integer>();
			al=ConvertToList(num);
			result.add(al);
		}
		
		for(int i=b; i<num.length; i++){
			swap(num, b, i);
			sol(num, b+1, result);
			swap(num, b, i);
		}
	}
	static public void swap(int[] num, int x, int y){
		int tmp=num[x];
		num[x]=num[y];
		num[y]=tmp;
	}
	static public ArrayList<Integer> ConvertToList(int[] num){
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++)
			al.add(num[i]);
		
		return al;		
	}
}
