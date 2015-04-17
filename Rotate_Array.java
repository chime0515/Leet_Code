
public class Rotate_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7};
		//int[] nums={1,2};
		int k=2;
		rotate(nums, k);
	}

	static public void rotate(int[] nums, int k){
		
		int len=nums.length;
		
		if(k>len)
				return;
		int idx=0;
		int distance=0;
		int cur=nums[0];
		 
		for(int i=0; i<len; i++){
			
			int next = (idx+k)%len;
			int temp = nums[next];
            nums[next] = cur;
            idx = next;
            cur = temp;
            
            distance = (distance + k) % len;
            
            if(distance == 0){
                idx = (idx + 1) % len;
                cur = nums[idx];
            }

		}
	
		for(int i=0; i<len; i++)
			System.out.print(nums[i] + " ");
		
	}
}
