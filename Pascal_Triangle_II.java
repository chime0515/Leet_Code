import java.util.*;
public class Pascal_Triangle_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList r=new ArrayList();
		r=sol(0);
		System.out.println(r.toString());
	}

	public static ArrayList<Integer> sol(int k){
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		if(k<0) return result;
		
		result.add(1);
		for(int i=1; i<=k; i++){
			for(int j=result.size()-1; j>0; j--){
				result.set(j, result.get(j)+result.get(j-1));
			}
			result.add(1);
		}
		return result;
	}
	

}
