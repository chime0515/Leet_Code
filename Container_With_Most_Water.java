
public class Container_With_Most_Water {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static public int maxArea(int[] height) {
        
        int b=0, e=height.length-1;
        int ans=0;
        while(b<=e){
            ans=Math.max( ans, (e-b) * Math.min(height[b], height[e]) );
            if(height[b]<height[e])
                b++;
            else
                e--;
        }
        
        return ans;
    }
}
