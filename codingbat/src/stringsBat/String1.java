package stringsBat;
/* Given two strings, append them together (known as "concatenation") and 
 * return the result. However, if the strings are different lengths,omit chars 
 * from the longer string so it is the same length as the shorter string. So 
 * "Hello" and"Hi" yield "loHi". The strings may be any length.*/
public class String1 {
	public String minCat(String a, String b) {
		if (a.length()>b.length()) {
			return a.substring( a.length()-b.length(),a.length())+b;
		} else if (a.length()<b.length()) {
			return a + b.substring( b.length()-a.length(),b.length());
		} else return a+b;
	}
	public static void main(String[] args) {
		String1 g = new String1();
		System.out.println(g.minCat("bi", "Hello"));

	}

}
