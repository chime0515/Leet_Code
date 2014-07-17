import java.math.*;
public class Unique_Paths {

	public static void main(String[] args) {
		int m=19, n=13;
		int ans=uniquePaths(m,n);
		int ans2=sol2(m,n);
		System.out.println(ans);
		System.out.println(ans2);
	}

	static public int sol2(int m, int n){
		
		if(m==1 || n==1) return 1;
		// Answer=C(sum, min)
		int sum=m-1+n-1;
		int min=Math.min(m-1, n-1);
		int[] xx=new int[min];
		int[] yy=new int[min-1];
		
		for(int i=0; i<xx.length; i++){
			xx[i]=sum;
			sum--;	
		}
		
		for(int i=0; i<yy.length; i++)
			yy[i]=i+2;

			
		for(int j=yy.length-1; j>=0; j--){
			for(int i=0; i<xx.length; i++){
				if(xx[i]%yy[j]==0){
					xx[i]=xx[i]/yy[j];
					yy[j]=1;
					break;
				}
			}
		}
		
		long div=1;
		long ans=1;
		
		for(int i=0; i<yy.length; i++)
			div=div*yy[i];
		
		for(int i=0; i<xx.length; i++)
			ans=ans*xx[i];
		
		return (int)(ans/div);
	}
	
	static public int uniquePaths(int m, int n) {

		int[][] A=new int[m][n];
		for(int i=0; i<m; i++)
			A[i][0]=1;
		for(int i=0; i<n; i++)
			A[0][i]=1;
		
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				A[i][j]=A[i-1][j]+A[i][j-1];
			}
		}
		
		return A[m-1][n-1];
		
	}
}
