package warmupBat;
//Given three int values, a b c, return the largest.
public class IntMax {
	public int intMax(int a, int b, int c) {
		if((a>b)&&(b>c))
			return a;
		if((b>a)&&(b>c))
			return b;
		return Math.max(a,c);
	}
	public static void main(String[] args) {
		IntMax g = new IntMax();
		System.out.println(g.intMax(3, 2, 1));
	}

}
