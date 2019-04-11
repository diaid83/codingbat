package stringsBat;
/*Given a string of even length, return the first half.
 *  So the string "WooHoo" yields "Woo".*/
public class FirstHalf {
	
	public String firstHalf(String str) {
		  return str.substring(0, str.length()/2);
	}
	
	public static void main(String[] args) {
		FirstHalf g = new FirstHalf();
		System.out.println(g.firstHalf("babibaaa"));

	}

}
