package logicBat;
/*Given 2 ints, a and b, return their sum. However, sums in the range 10..19
  inclusive, are forbidden, so in that case just return 20.*/
public class SortaSum {
	public int sortaSum(int a, int b) {
		int sum = a+b;
		if (sum>=10&&sum<20)
			return 20;
		return sum;
	}
	public static void main(String[] args) {
		SortaSum g = new SortaSum();
		System.out.println(g.sortaSum(10, 2));

	}

}
