package arrayBat;
/*Start with 2 int arrays, a and b, each length 2. Consider the sum of the 
  values in each array. Return the array which has the largest sum. In event
  of a tie, return a.*/
public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		int suma = a[0]+ a[1];
		int sumb = b[0]+ b[1];
		if (sumb>suma) {
			return b;
		}else return a;

	}
}
