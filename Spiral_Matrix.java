import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = new char[][] {    
				{'i',	'l', 	'o', 	'v', 	'e' },
				{'d',	'i', 	'n', 	't', 	'e' },
				{'n', 	'e', 	'w', 	'e', 	'p' }, 
				{'a', 	'i', 	'v', 	'r', 	'i' }, 
				{'m',	'a', 	'x', 	'e', 	'c' } };
		
		List<Character> list=spiralOrder(matrix);
		System.out.println(list);
	}

	public static List<Character> spiralOrder(char[][] matrix) {
        List<Character> list=new ArrayList<Character>();
        if(matrix.length==0)
            return list;
            
        int m=matrix.length, n=matrix[0].length;
        int row=0, col=-1;
        while(true){
            for(int i=0; i<n; i++)
                list.add(matrix[row][++col]);
            m--;
            if(m==0) break;
                
            for(int i=0; i<m; i++)
                list.add(matrix[++row][col]);
            
            n--;
            if(n==0) break;
            
            for(int i=0; i<n; i++)
                list.add(matrix[row][--col]);
            
            m--;
            if(m==0) break;
            
            for(int i=0; i<m; i++)
                list.add(matrix[--row][col]);
            
            n--;
            if(n==0) break;
            
        }
        return list;
    }
}
