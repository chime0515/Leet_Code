
public class Single_Number_II {

	public static void main(String[] args) {
		
		int[] A={1,3,1,3,2,3,2,2,1,-2147483648,-2147483648,-2147483648, 2147483647};
		int ans=sol(A);
		System.out.println(ans);
	}
	
	static public int sol(int[] A){
		int ans=0;
		int[] count=new int[32];
		
		for(int i=0; i<32; i++)
			count[i]=0;
		
		for(int i=0; i<A.length; i++){
			int mask=1;
			for(int j=0; j<32; j++){		
				int result=mask & (A[i]>>j);
				if(result!=0)
					count[j]++;
			}
		}
		
		for(int i=0; i<32; i++){
			count[i]=count[i]%3;
			ans=ans | (count[i]<<i);
		}
	
		return ans;
		
	}
}
