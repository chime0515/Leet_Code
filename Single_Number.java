
public class Single_Number {

	public static void main(String[] args) {
		int[] A={1,2,4,5,4,5,1};

		System.out.println(singleNumber(A));
	}

    static public int singleNumber(int[] A) {
        int result=0;
        
        for(int i=0; i<A.length; i++){
            result=result^A[i];
        }

        return result;
    }
}
