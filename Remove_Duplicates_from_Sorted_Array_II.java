import java.lang.reflect.Array;
import java.util.*;


public class Remove_Duplicates_from_Sorted_Array_II {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={1,1,1,2,2,3};
		int r=sol(A);
		print(A);
		System.out.println(r);
	}

	public static int sol(int[] A){
        if(A==null || A.length==0) return 0;
        
        int index=0;
        int counter=1;
        
        for(int i=0; i<A.length; i++){
            if(i!=0 && A[i]==A[i-1]){
                counter++;
                if(counter>=3)
                    continue;
            }
            else{
                counter=1;
            }
            A[index]=A[i];
            index++;
        }
        return index;
	}
	public static void print(int[] A){
		for(int i=0 ;i<A.length; i++){
			System.out.print(A[i] +" ");
		}
		System.out.println();
	}
}
