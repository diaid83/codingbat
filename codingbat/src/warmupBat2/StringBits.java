package warmupBat2;
/*Given a string, return a new string made of every other char starting with the
 *first, so "Hello" yields "Hlo".*/
public class StringBits {
	public String stringBits(String str) {
		String string = "";
		for (int i = 0; i<str.length();i+=2)
			string += str.charAt(i);
			return string;
	}
	public static void main(String[] args) {
		StringBits g = new StringBits();
		System.out.println(g.stringBits("Heeololeo"));

	}

}
