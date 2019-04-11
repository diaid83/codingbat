package logicBat;
/*Return true if the given non-negative number is 1 or 2 less than a multiple
 *of 20. So for example 38 and 39 return true, but 40 returns false.*/
public class Less20 {
	public boolean less20(int n) {
		  return (n%20>17 && n%20<20);
	}
	public static void main(String[] args) {
		Less20 g = new Less20();
		System.out.println(g.less20(40));
	}

}
