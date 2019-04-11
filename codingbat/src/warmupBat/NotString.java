package warmupBat;
/*Given a string, return a new string where "not " has been added to the front.
 *However, if the string already begins with "not", return the string unchanged.
 *Note: use .equals() to compare 2 strings.*/
public class NotString {
	public String notString(String str) {
		if(str.length()<3)
			return "not " + str;
		if(str.subSequence(0, 3).equals("not"))
			return str;
		return "not " + str;
		
	}
	public static void main(String[] args) {
		NotString g = new NotString();
		System.out.println(g.notString("x"));

	}

}
