import java.util.HashMap;
import java.util.Map;


public class Two_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<A.length; i++){
            if(map.containsKey(target-A[i])){
                return new int[] {map.get(target-A[i])+1, i+1};
            }
            map.put(A[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
