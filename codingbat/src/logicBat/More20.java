package logicBat;
/*Return true if the given non-negative number is 1 or 2 more than a 
 * multiple of 20.*/
public class More20 {
	public boolean more20(int n) {
		  return (n%20==1||n%20==2);
	}
	public static void main(String[] args) {
		More20 g = new More20();
		System.out.println(g.more20(42));

	}

}
