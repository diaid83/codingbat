package warmupBat;
/*Given a string, return a new string where the first and last chars
 *have been exchanged.*/
public class FrontBack {
	public String frontBack(String str) {
		if (str.length()<=1)
			return str;
		return (str.substring(str.length()-1)
				+str.substring(1, str.length()-1)
				+ str.substring(0,1));  

	}
	public static void main(String[] args) {
		FrontBack g = new FrontBack();
		System.out.println(g.frontBack("code"));

	}

}
