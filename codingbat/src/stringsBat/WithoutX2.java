package stringsBat;
/*Given a string, if one or both of the first 2 chars is 'x', return the 
 *string without those 'x' chars, and otherwise return the string unchanged.
 *This is a little harder than it looks.*/
public class WithoutX2 {
	public String withoutX2(String str) {
		if (str.length()<2) {
			return str = "";
		}
		if (str.charAt(0)=='x'&& str.charAt(1)!='x') {
			str = str.substring(1);
		}else if (str.charAt(0)!='x'&&str.charAt(1)=='x') {
			return str.substring(0, 1) + str.substring(2);
		}
		if (str.charAt(0)=='x'&& str.charAt(1)=='x') {
			return str.substring(2);
		}
		return str;
	}
	public static void main(String[] args) {
		WithoutX2 g = new WithoutX2();
		System.out.println(g.withoutX2("xxkjh"));

	}

}
