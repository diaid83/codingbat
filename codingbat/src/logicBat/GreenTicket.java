package logicBat;
/*You have a green lottery ticket, with ints a, b, and c on it. If the numbers 
 *are all different from each other, the result is 0. If all of the numbers 
 *are the same, the result is 20. If two of the numbers are the same, the 
 *result is 10.*/
public class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		if(a!=b&&a!=c&&b!=c)
			return 0;
		if(a==b&&b==c)
			return 20;
		if(a==b||a==c||b==c)
			return 10;
		return 0;
		/*if(a == b)
		{
			if(b == c)
				return 20;
			return 10;
		}
		if(a == c || b == c)
			return 10;
		return 0;*/
}
	public static void main(String[] args) {
		GreenTicket g = new GreenTicket();
		System.out.println(g.greenTicket(1, 2, 3));
	}

}
