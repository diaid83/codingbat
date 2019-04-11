package stringsBat;
/* Given a string of any length, return a new string where the last 2 chars,
 * if present, are swapped, so "coding" yields "codign".*/
public class LastTwo {
	public String lastTwo(String str) {
		if (str.length()<2) {
			return str;
		}else return str.substring(0, str.length() - 2)
				+ str.charAt(str.length() - 1)
				+ str.charAt(str.length() - 2);
	}
	public static void main(String[] args) {
		LastTwo g = new LastTwo();
		System.out.println(g.lastTwo("test"));
	}

}
