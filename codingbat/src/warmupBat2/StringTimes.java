package warmupBat2;
/*Given a string and a non-negative int n, return a larger string that is 
 *n copies of the original string.*/
public class StringTimes {
	public String stringTimes(String str, int n) {
		String s = "";
		for(int i = 0; i<n; i++)
			s+=str;
		return s;
	}
	public static void main(String[] args) {
		StringTimes g = new StringTimes();
		System.out.println(g.stringTimes("Hi", 3));
	}

}
