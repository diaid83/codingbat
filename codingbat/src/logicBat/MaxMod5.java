package logicBat;
/*Given two int values, return whichever value is larger. However if the two
 *values have the same remainder when divided by 5, then the return the smaller
 *value. However, in all cases, if the two values are the same, return 0.*/

public class MaxMod5 {
	public int maxMod5(int a, int b) {
		if(a==b)
			return 0;
		if(a%5==b%5) {
			if (a>b)
				return b;
			return a;  
		}
		if (a>b)
			return a;
		return b;

	}
	public static void main(String[] args) {
		MaxMod5 g = new MaxMod5();
		System.out.println(g.maxMod5(9, 15));
	}

}
