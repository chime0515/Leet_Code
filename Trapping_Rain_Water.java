
public class Trapping_Rain_Water {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
		
		int[] A={4,2,3};
		int r=sol(A);
		System.out.println(r);
	}

	public static int sol(int[] A){
		int[] maxL=new int[A.length];
		int[] maxR=new int[A.length];
		int result=0;
		
		int max=A[0];
		for(int i=1; i<A.length; i++){
			maxL[i]=max;
			if(A[i]>max)
				max=A[i];					
		}
		
		max=A[A.length-1];
		for(int i=A.length-2; i>=0; i--){
			maxR[i]=max;
			if(A[i]>max)
				max=A[i];			
		}
		
		for(int i=1; i<A.length-1; i++){
			int trap=Math.min(maxL[i], maxR[i]) - A[i];
			if(trap>0) 
				result+=trap;
		}
		
		return result;
	}
}
