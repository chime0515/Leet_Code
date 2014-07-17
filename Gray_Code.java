import java.util.*;
public class Gray_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(grayCode(n));
	}

	static public ArrayList<Integer> grayCode(int n) {
		
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();		
		ArrayList<Integer> pre=new ArrayList<Integer>();
		if(n==0){
			pre.add(0);
			return pre;	
		}
		pre.clear();
		int pow=1;
		
		pre.add(0);
		pre.add(1);
		result.add(pre);
		
		for(int i=2; i<=n; i++){
			pow=pow*2;
			ArrayList<Integer> tmp=new ArrayList<Integer>();
			for(int j=0; j<pre.size(); j++){
				tmp.add(pre.get(j));
			}
			
			for(int j=pre.size()-1; j>=0; j--){
				tmp.add(pre.get(j)+pow);
			}
			pre=tmp;
			result.add(tmp);
		}
		
		
		
		return result.get(n-1);
    }
}
