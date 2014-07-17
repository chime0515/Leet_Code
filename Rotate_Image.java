
public class Rotate_Image {

	public static void main(String[] args) {
		
		int n=3;
		int[][] matrix=new int[n][n];
		
		ini(matrix);
		System.out.println("-----");
		rotate(matrix);
	}
	
	static public void ini(int[][] matrix){
		int count=0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j]=count;
				count ++;
				System.out.print(matrix[i][j] +"  ");
			}
			System.out.println();
		}	
	}
	
    static public void rotate(int[][] m) {
        
    	if(m.length==1) return;
    	int n=m.length;
    	// swap layer from outside to inside
    	for(int i=0; i<n/2; i++){    		
    		for(int j=0; j<(n+1)/2; j++){
    			//tmp=top
    			int tmp=m[i][j];
    			//top=left
    			m[i][j]=m[n-j-1][i];
    			//left=bot
    			m[n-j-1][i]=m[n-1-i][n-1-j];
    			//bot=right
    			m[n-1-i][n-1-j]=m[j][n-1-i];
    			//right=tmp
    			m[j][n-1-i]=tmp;
    		}
    	}
    	
    	print(m);
    }
    
    static public void swap(int[][] matrix, int layer){
 
   
    	for(int i=layer; i<matrix.length-layer; i++){
    		int[] tmp=new int[matrix.length];
    		tmp[i]=matrix[layer][i];
 
    		// top=left	
    		matrix[layer][i]=matrix[matrix.length-1-i][layer];	
    		
    		// left=bot
    		matrix[i][layer]=matrix[matrix.length-1-layer][i];
    		
    		// bot=right
    		matrix[matrix.length-1-layer][i]=matrix[matrix.length-1-i][matrix.length-1-layer];
    		
    		// right=tmp
    		matrix[matrix.length-1-i][matrix.length-1-layer]=tmp[i+layer];
    		//System.out.println("Stop");
    	}
    }
    
    static public void print(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] +"  ");
			}
			System.out.println();
		}
    }
}
