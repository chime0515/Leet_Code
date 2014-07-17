
public class Remove_Duplicates_from_Sorted_Array {


	public static void main(String[] args) {

		int[] A={1,1,1,2,2,4};
		int ans=removeDuplicates(A);
		System.out.println(ans);
		
		for(int i=0; i<A.length; i++)
			System.out.print(A[i] +"->");
	}

	
    public static int removeDuplicates(int[] A) {
        if(A.length<=1) return A.length;
        int p1=0;
        int p2=1;
        while(p2<A.length-1){
        	
            if(A[p1]==A[p2])
            	p2++;
            else{
            	p1++;
            	A[p1]=A[p2];
            	p2++;
            }        
        }
        
        return p1+1;
    }
    
    public static void swap(int[] A, int x, int y){
        int tmp=A[x];
        A[x]=A[y];
        A[y]=tmp;
    }
}
