package stringBat2;
/*Given a string, return a string where for every char in the original, there
 *are two chars.*/
public class DoubleChar {
	public String doubleChar(String str) {
		String result = "";
		for(int i=0;i<=str.length()-1;i++) {
			result = result + str.charAt(i) + str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		DoubleChar g = new DoubleChar();
		System.out.println(g.doubleChar("Hi-There"));
	}

}
