package stringsBat;
/* Given a string, return a string length 1 from its front, unless front 
 * is false, in which case return a string length 1 from its back. 
 * The string will be non-empty.*/
public class TheEnd {
	public String theEnd(String str, boolean front) {
		if (front == true) {
			return str.substring(0,1);
		}
		else return str.substring(str.length()-1);
	}
	public static void main(String[] args) {
		TheEnd g = new TheEnd();
		System.out.println(g.theEnd("World", true));
	}
}
