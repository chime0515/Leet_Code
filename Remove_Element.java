
public class Remove_Element {

	public static void main(String[] args) {
		
		int[] A={1,2,3,4,2,2,5,2};
		int elem=2;
		System.out.println(remove_ele(A, elem));
		
		for(int i=0; i<A.length; i++)
			System.out.print(A[i] +" ");
		
	}

	public static int remove_ele(int[] A, int elem){
		if(A.length<=1) return A.length;
		int p1=0;
		int p2=A.length-1;
		
		while(p1<=p2){
			
			if(A[p1]==elem){
				swap(A, p1, p2);
				p2--;
			}
			else
				p1++;
		}
		
		return p2+1;
	}
	
	public static void swap(int[] A, int x, int y){
		int tmp=A[x];
		A[x]=A[y];
		A[y]=tmp;
	}
}
