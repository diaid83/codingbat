package logicBat;
/*Given three ints, a b c, return true if two or more of them have the same 
 *rightmost digit. The ints are non-negative.*/
public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
		 if (a%10==b%10||a%10==c%10)
			 return true;
		 return (b%10==c%10);
	}
	public static void main(String[] args) {
		LastDigit g = new LastDigit();
		System.out.println(g.lastDigit(23, 34, 33));
	}

}
