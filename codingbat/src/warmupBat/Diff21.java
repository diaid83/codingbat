package warmupBat;
/*Given an int n, return the absolute difference between n and 21, except return
 *double the absolute difference if n is over 21.*/
public class Diff21 {
	public int diff21(int n) {
		if (n <= 21) 
		    return 21 - n;
		  else  return (n - 21) * 2;
	}
	public static void main(String[] args) {
		Diff21 g = new Diff21();
		System.out.println(g.diff21(22));

	}

}
