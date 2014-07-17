
public class Climbing_Stairs {

	public static void main(String[] args) {

		int n=4;
		int ans=climbStairs(n);
		
		System.out.println(ans);

	}

	public static int climbStairs(int n){
		
        if(n==1) return 1;
        if(n==2) return 2;
        
        int[] table=new int[n+1];
        table[0]=0;
        table[1]=1;
        table[2]=2;
        
        for(int i=3; i<=n; i++){
            table[i]=table[i-1]+table[i-2];
        }
        
        return table[n];
	}
}
