package logicBat;
/*Given three ints, a b c, return true if one of them is 10 or more less than
 *one of the others.*/
public class LessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		return(Math.abs(a - b) >= 10 ||
				Math.abs(b - c) >= 10 ||
				Math.abs(c - a) >= 10);
	}
	public static void main(String[] args) {
		LessBy10 g = new LessBy10();
		System.out.println(g.lessBy10(1, 7, 10));
	}

}
