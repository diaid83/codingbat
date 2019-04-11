package stringsBat;
/*Given a string, return a "rotated left 2" version where the first 2 
 *chars are moved to the end. The string length will be at least 2.*/
public class Left2 {
	public String left2(String str) {
		return str.substring(2) + str.substring(0, 2);
	}
	public static void main(String[] args) {
		Left2 g = new Left2();
		System.out.println(g.left2("Hello World"));
	}
}
