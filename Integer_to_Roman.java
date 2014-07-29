
public class Integer_to_Roman {

	public static void main(String[] args) {
		
		int num=7;
		
		String s=intToRoman(num);
		System.out.println(s);

	}

	public static String intToRoman(int num) {
		
		int [] val={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
        String [] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
		StringBuffer sb=new StringBuffer();

		for(int i=0; num>0; i++){
			
			while(num>=val[i]){
				num-=val[i];
				sb.append(symbol[i]);
			}
		}
		
		return sb.toString();
    }
}
