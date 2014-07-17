
public class Sort_Colors {

	public static void main(String[] args) {
		
		//int[] A={2,2,2,1,1,0,0};
		
		int[] A={2,2,0,2,1,2,1,0,0};
		sortColors(A);
		for(int i=0; i<A.length; i++)
			System.out.print(A[i]);
	}

	
	static public void sortColors(int[] A) {
    
		int p0=0, p1=0, p2=0;
		
		for(int i=0; i<A.length; i++){
			if(A[i]==0){
				A[p2]=2;
				A[p1]=1;
				A[p0]=0;
				p0++;
				p1++;
				p2++;
			}
			
			else if(A[i]==1){
				A[p2]=2;
				A[p1]=1;
				p1++;
				p2++;
			}
			
			else{
				A[p2]=2;
				p2++;
			}
		}
    }
	
	
	

}
