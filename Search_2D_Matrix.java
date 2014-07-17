public class Search_2D_Matrix {

	public static void main(String[] args) {

		int[][] m={ {1,   3,  5,  7},
				  	{10, 11, 16, 20},
				  	{23, 30, 34, 50}};

		boolean ans=searchMatrix(m, 50);
		System.out.println(ans);
		
	}

	static public boolean searchMatrix(int[][] m, int target) {
      
		if(target<m[0][0]) return false;
        
		int row=-1;
		
		for(int i=0; i<m.length; i++){
			if(m[i][0]==target)
				return true;
			if(target>m[i][0])
				row=i;
		}
		//System.out.println(col);
		if(row<0) return false;
		else{
			return binary_search(m[row], 0, m[0].length-1, target);
		}
		
    }
	static public boolean binary_search(int[] A, int b, int e,int target){
		
		while(b<=e){
			int mid=b+(e-b)/2;
			if(A[mid]==target) return true;
			if(A[mid]<target)
				b=mid+1;
			else{
				e=mid-1;
			}			
		}
		return false;
	}
}
