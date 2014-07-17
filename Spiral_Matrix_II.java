
public class Spiral_Matrix_II {

	public static void main(String[] args) {
		
		int n=4;
		int[][] ans = new int[n][n];
		ans=generateMatrix(n);
		print(ans);
	}
	static public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int lvl=n/2;
        int counter=1;
        for(int l=0; l<lvl; l++){
        	//top
        	for(int i=l; i<n-l; i++)
        		ans[l][i]=counter++;
        	//right
        	for(int i=l+1; i<n-l; i++)
        		ans[i][n-l-1]=counter++;
        	//botton
        	for(int i=n-l-2; i>=l; i--)
        		ans[n-l-1][i]=counter++;
        	//left
        	for(int i=n-l-2; i>l; i--)
        		ans[i][l]=counter++;
        }
        
        if(n%2==1)
        	ans[lvl][lvl]=counter;
        
        return ans;
    }

	
	static public void print(int[][] m){
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				System.out.print(m[i][j] +"\t");
			}
			System.out.println();
		}
	}
	
}
