package warmupBat2;
//Given a non-empty string like "Code" return a string like "CCoCodCode".
public class StringSplosion {
	public String stringSplosion(String str) {
		String string = "";
		for(int i = 0; i<=str.length();i++)
			string += str.substring(0, i);
		return string;
		
	}
	public static void main(String[] args) {
		StringSplosion g = new StringSplosion();
		System.out.println(g.stringSplosion("Java"));

	}

}
