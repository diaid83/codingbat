package stringsBat;
/* Given 2 strings, a and b, return a new string made of the first char of 
 * a and the last char of b, so "yo" and "java" yields "ya". If either
 * string is length 0, use '@' for its missing char.*/
public class LastChars {
	public String lastChars(String a, String b) {
		if (a.length()==0) {
			a = "@";
		}else a = a.substring(0, 1);
		if (b.length()==0) {
			b = "@";
		}else b = b.substring(b.length()-1);
		return a+b;
	}
	public static void main(String[] args) {
		LastChars g = new LastChars();
		System.out.println(g.lastChars("last", "ol"));

	}

}
