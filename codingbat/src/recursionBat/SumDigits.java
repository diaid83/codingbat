package recursionBat;
/*Given a non-negative int n, return the sum of its digits recursively (no loops)
 *. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
 *divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/
public class SumDigits {
	public int sumDigits(int n) {
		if(n<10)
			return n;
		return sumDigits(n/10)+n%10;
	}
	public static void main(String[] args) {
		SumDigits g = new SumDigits();
		System.out.println(g.sumDigits(126));
	}
}
