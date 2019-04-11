package warmupBat;
/*Given 2 int values, return true if one is negative and one is positive.
 *Except if the parameter "negative" is true, then return true only if both
 *are negative.*/
public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		if(negative)
			return (a<0&&b<0);
		return ((a>0&&b<0)||(a<0&&b>0));
	}
	public static void main(String[] args) {
		PosNeg g = new PosNeg();
		System.out.println(g.posNeg(-4, -5, true));

	}

}
