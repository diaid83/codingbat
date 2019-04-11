package logicBat;
/*Return true if the given non-negative number is a multiple of 3 or 5, but
 *not both.*/
public class Old35 {
	public boolean old35(int n) {
		if(n % 3 == 0 && n % 5 == 0)
			return false;
		return(n % 3 == 0 || n % 5 == 0);

	}

	public static void main(String[] args) {
		Old35 g = new Old35();
		System.out.println(g.old35(10));

	}

}
