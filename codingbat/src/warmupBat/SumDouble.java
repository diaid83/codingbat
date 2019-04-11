package warmupBat;
/*Given two int values, return their sum. Unless the two values are the same,
 *  then return double their sum.*/
public class SumDouble {
	public int sumDouble(int a, int b) {
		  if(a==b)
			  return (a+b)*2;
		  return a+b;
	}
	public static void main(String[] args) {
		SumDouble g = new SumDouble();
		System.out.println(g.sumDouble(3, 3));

	}

}
