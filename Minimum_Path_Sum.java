
public class Minimum_Path_Sum {

	public static void main(String[] args) {

		int[][] grid={{0,1,7,1},{3,5,2,3},{4,1,1,1}};
		print(grid);
		int ans=minPathSum(grid);
		System.out.println(ans);
	}

	public static int minPathSum(int[][] grid){
		
		int y=grid.length;
		int x=grid[0].length;
		
		for(int i=1; i<x; i++)
			grid[0][i]=grid[0][i-1]+grid[0][i];
		
		
		for(int i=1; i<y; i++)
			grid[i][0]=grid[i-1][0]+grid[i][0];
		
		//print(grid);
		
		for(int i=1; i<y; i++){
			for(int j=1; j<x; j++){
				grid[i][j]=Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
			}
		}
		print(grid);
		return grid[y-1][x-1];
	}
	
	public static void print(int[][] grid){
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[0].length; j++){
				System.out.print(grid[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}
