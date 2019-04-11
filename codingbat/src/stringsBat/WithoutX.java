package stringsBat;
/*Given a string, if the first or last chars are 'x', return the string
 *without those 'x' chars, and otherwise return the string unchanged.*/
public class WithoutX {
	public String withoutX(String str) {
		if (str.length() > 0 && str.charAt(0) == 'x') {
			str = str.substring(1);
		}
		if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
			str = str.substring(0, str.length()-1);
		}
		return str;

	}
	public static void main(String[] args) {
		WithoutX g = new WithoutX();
		System.out.println(g.withoutX("hxix"));

	}
}

