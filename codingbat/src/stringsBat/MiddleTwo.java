package stringsBat;
/*Given a string of even length, return a string made of the middle 
 * two chars, so the string "string" yields "ri". The string length 
 * will be at least 2.*/
public class MiddleTwo {
	public String middleTwo(String str) {
		return str.substring(str.length()/2-1, str.length()/2+1);
	}
	public static void main(String[] args) {
		MiddleTwo g = new MiddleTwo();
		System.out.println(g.middleTwo("Worlds"));

	}

}
