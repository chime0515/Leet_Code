
public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] A={-2,-3,4,-1,2,1,-5,4};
		//int[] A={-1,0,-2};
		int ans=maxSubArray(A);
		System.out.println(ans);
		
	}
	
	public static int maxSubArray(int[] A){
		
		int[] table=new int[A.length];
		table[0]=A[0];
		if(A.length>=2){
			if(A[1]>(A[0]+A[1])) table[1]=A[1];
			else table[1]=A[1]+A[0];
		}
		
		if(A.length==1) return table[0];
        if(A.length==2) return Math.max(table[0],table[1]);
		
		
		for(int i=2; i<A.length; i++){
			if(table[i-1]>0){
				table[i]=A[i]+table[i-1];
			}
			else{
				table[i]=A[i];
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<A.length; i++)
			if(max<table[i]) max=table[i];
		
		return max;
	}

}
