package stringBat2;
/*Return the number of times that the string "hi" appears anywhere in the given 
 *string.*/
public class CountHi {
	public int countHi(String str) {
		int count  = 0;
		String string = "hi";
		for (int i = 0; i < str.length()-1; i++) {
			if(string.equals(str.substring(i, i+2)))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		CountHi g = new CountHi();
		System.out.println(g.countHi("hihi"));

	}

}
