
public class Search_in_Rotated_Sorted_Array_II {


	public static void main(String[] args) {
		int[] A={2,3,3,3,4,0,1};
		int target=4;
		System.out.println(search(A,target));
	}

	
    public static boolean search(int[] A, int target) {
        if(A.length==0 || A==null ) return false;
        int b=0;
        int e=A.length-1;
        
        while(b<=e){
            int m=b+(e-b)/2;
            
            if(A[m]==target) return true;
            
            else if(A[m]>A[b]){
                if(target>=A[b] && target<A[m])
                    e=m-1;
                else
                    b=m+1;
            }
            else if(A[m]<A[b]){
                if(target>A[m] && target<=A[e])
                    b=m+1;
                else
                    e=m-1;
            }
            else{ // A[m]==A[b]
                b++;
            }
        }
        return false;
    }
}
