package warmupBat;
/*Given 2 int values, return true if they are both in the range 30..40 inclusive,
 *or they are both in the range 40..50 inclusive.*/
public class In3050 {
	public boolean in3050(int a, int b) {
		boolean x = ((a>=30&&a<=40)&&(b>=30&&b<=40));
		boolean y = ((a>=40&&a<=50)&&(b>=40&&b<=50));
		return x||y;

	}
	public static void main(String[] args) {
		In3050 g = new In3050();
		System.out.println(g.in3050(40, 31));

	}

}
