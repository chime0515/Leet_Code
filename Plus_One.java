
public class Plus_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits={9};
		plusOne(digits);
		//for(int i=0; i<digits.length; i++)
			//System.out.print(digits[i]);
	}

	static public int[] plusOne(int[] digits) {
		int carry=1;
		
		for(int i=digits.length-1; carry==1&&i>=0; i--){
			digits[i]+=carry;			
			carry=digits[i]/10;
			digits[i]%=10;
		}
		
		if(carry==0) return digits; 
		else{
    		int[] B=new int[digits.length+1];
    		B[0]=1;
    		for(int i=1; i<B.length; i++){
    			B[i]=digits[i-1];
    		}
    		return B;
		}
	}
	
}
