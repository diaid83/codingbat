package stringBat2;
/*Given two strings, return true if either of the strings appears at the very end
 *of the other string, ignoring upper/lower case differences (in other words, the
 *computation should not be "case sensitive"). Note: str.toLowerCase() returns the
 *lowercase version of a string.*/
public class EndOther {
	public boolean endOther(String a, String b) {
		return a.toLowerCase().endsWith(b.toLowerCase())||
				b.toLowerCase().endsWith(a.toLowerCase());
	}
	public static void main(String[] args) {
		EndOther g = new EndOther();
		System.out.println(g.endOther("Hiabc", "abcd"));

	}

}
