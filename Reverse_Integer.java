
public class Reverse_Integer {

	public static void main(String[] args) {

		int a=-123;
		
		int r=sol(a);
		
		System.out.println(r);

	}

	static public int sol(int x){
        boolean positive=true;
        
        if(x<0){
            positive=false;
            x=Math.abs(x);
        }
        
        int r=x%10;
        x=x/10;
        
        while(x>0){
            int tmp=x%10;
            x=x/10;
            r=r*10+tmp;
        }
       
        if(positive==false)
            return r*(-1);
        else 
            return r;
	}
}
