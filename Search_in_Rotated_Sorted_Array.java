
public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {

		int target=1;
		int[] A={3,1};

		int ans=binarySearch(A, target);
		System.out.println(ans);
	}

	
	static public int binarySearch(int[] A, int target){
		int b=0;
		int e=A.length-1;
		int mid;
		while(b<=e){
			mid=b+(e-b)/2;
			if(A[mid]==target) return mid;
			
			if(A[mid]>=A[b]){
				if(target>=A[b] && target<A[mid])
					e=mid-1;
				else
					b=mid+1;
			}
			else{// SEARCH THE REST OF SROTED ARRAY
				
				if(target>A[mid] && target<=A[e])
					b=mid+1;
				
				else
					e=mid-1;
			}
			
		}
		
		return -1;

	}
}
