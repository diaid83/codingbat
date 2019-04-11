package logicBat;
/*Given a non-negative number "num", return true if num is within 2 of a
 *  multiple of 10. Note: (a % b) is the remainder of dividing a by b, so 
 *  (7 % 5) is 2.*/
public class NearTen {
	public boolean nearTen(int num) {
		  return (num % 10 < 3 || num % 10 > 7);
	}
	public static void main(String[] args) {
		NearTen g = new NearTen();
		System.out.println(g.nearTen(8));
	}

}
