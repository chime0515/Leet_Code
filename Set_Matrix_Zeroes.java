
public class Set_Matrix_Zeroes {

	public static void main(String[] args) {
		int[][] m = {{0,0,0,5},
					{4,3,1,4},
					{0,1,1,4},
					{1,2,1,7},
					{0,0,1,1}};
		print(m);
		setZeros(m);
		System.out.println("======================");
		print(m);
	}
	
	static public void setZeros(int[][] m){

		boolean col=false, row=false; 
		
		for(int i=0; i<m.length; i++){
			if(m[i][0]==0)
				row=true;
		}
		
		for(int i=0; i<m[0].length; i++){
			if(m[0][i]==0)
				col=true;
		}
		
		for(int i=1; i<m.length; i++){
			for(int j=1; j<m[0].length; j++){
				if(m[i][j]==0){
					m[i][0]=0;
					m[0][j]=0;
				}
			}
		}
		
		for(int i=1; i<m.length; i++){
			if(m[i][0]==0){
				for(int j=1; j<m[0].length; j++){
					m[i][j]=0;
				}
			}
		}
		
		for(int j=1; j<m[0].length; j++){
			if(m[0][j]==0){
				for(int i=1; i<m.length; i++){
					m[i][j]=0;
				}
			}
		}
		
		if(col){
			for(int i=0; i<m[0].length; i++)
				m[0][i]=0;
		}
		if(row){
			for(int i=0; i<m.length; i++)
				m[i][0]=0;
		}
		
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
