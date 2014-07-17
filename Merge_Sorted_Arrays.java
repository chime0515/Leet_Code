
public class Merge_Sorted_Arrays {

	public static void main(String[] args) {

		int[] A={1,3,5,7,9};
		int[] B={0,2,4,6,8};
		int m=A.length;
		int n=B.length;
		merge(A, m, B, n);
	}

    static public void merge(int A[], int m, int B[], int n) {
        
        while(m-1>=0 && n-1>=0){
            
            if(A[m-1]>B[n-1]){
                A[n+m-1]=A[m-1];
                m--;
            }
            else{
                A[n+m-1]=B[n-1];
                n--;
            }
        }
        
        while(n-1>=0){
            A[m+n-1]=B[n-1];
            n--;
        }
    }
}
