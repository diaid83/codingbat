package warmupBat2;
/*Count the number of "xx" in the given string. We'll say that overlapping is 
 *allowed, so "xxx" contains 2 "xx".*/
public class CountXX {
	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("xx"))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		CountXX g = new CountXX();
		System.out.println(g.countXX("xxxx"));

	}

}
