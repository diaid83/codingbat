package stringsBat;
/*Given 2 strings, return their concatenation, except omit the first
 *char of each. The strings will be at least length 1.*/
public class NonStart {
	public String nonStart(String a, String b) {
		  a = a.substring(1);
		  b = b.substring(1);
		  return a+b;
		  }
	public static void main(String[] args) {
		NonStart g = new NonStart();
		System.out.println(g.nonStart("Hello", "World"));
	}
}
