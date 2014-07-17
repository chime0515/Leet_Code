
public class Search_Insert_Position {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={1,3,5,6};
		int target=6;
		int ans=searchInsert(A, target);
		System.out.println(ans);
	}
	static public int searchInsert(int[] A, int target) {
        if(target < A[0]) return 0;
        if(target > A[A.length-1]) return A.length;
        
        int result=-100;
        result=binSearch(A, target, 0, A.length-1);
		return result;
    }
	
	static public int binSearch(int[] A, int target, int b, int e){
		
		int mid=b+(e-b)/2;
		if(target==A[mid]) return mid;
		if(b>e) return b;
		
		if(target>A[mid])
			return binSearch(A, target, mid+1, e);
		else
			return binSearch(A, target, b, mid-1);	
	}
}
