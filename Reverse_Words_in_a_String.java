public class Reverse_Words_in_a_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1  the sky is blue  ";
		String s2 = " a";
		String ans = reverseWords(s2);
		System.out.println(ans);

	}

	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int index = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				index = i;
			} else {
				if (i == 0 || s.charAt(i - 1) == ' ') {
					sb.append(s.substring(i, index));
					if (sb.length() != 0)
						sb.append(' ');
				}
			}
		}

		return sb.toString();
	}
}
