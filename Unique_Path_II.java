
public class Unique_Path_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int uniquePathsWithObstacles(int[][] ob) {
	     
        if(ob.length==0) return 0;
        
        int m=ob.length, n=ob[0].length;
        
        if(ob[0][0]==1 || ob[m-1][n-1]==1)
            return 0;
        
        int[][] mat=new int[m][n];
        mat[0][0]=1;
        
        for(int i=1; i<m; i++){
            if(ob[i][0]==1)
                    mat[i][0]=0;
            else
                mat[i][0]=mat[i-1][0];
            
        }
        
        for(int i=1; i<n; i++){
            if(ob[0][i]==1)
                    mat[0][i]=0;
            else
                mat[0][i]=mat[0][i-1];
        }
            
            
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(ob[i][j]==1)
                    mat[i][j]=0;
                else
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
            }
        }
        
        return mat[m-1][n-1];
    }
}
