package stringsBat;
/*Given a string, return a new string made of 3 copies of the last 2 chars of the
 *original string. The string length will be at least 2.*/
 
public class ExtraEnd {
	public String extraEnd(String str) {
		String s = str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) {
		ExtraEnd g = new ExtraEnd();
		System.out.println(g.extraEnd("home"));

	}

}
