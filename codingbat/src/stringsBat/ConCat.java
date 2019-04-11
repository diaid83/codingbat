package stringsBat;
/* Given two strings, append them together (known as "concatenation") and
 * return the result. However, if the concatenation creates a double-char,
 * then omit one of the chars, so "abc" and "cat" yields "abcat".*/
public class ConCat {
	public String conCat(String a, String b) {
		if(a == "") {
			return b;
		}else if  (b.startsWith(a.substring(a.length()-1)) ){
			return a.substring(0,a.length()-1)+b;
		}else return a+b;
	}
	public static void main(String[] args) {
		ConCat g = new ConCat();
		System.out.println(g.conCat("abc", "cat"));
	}

}
