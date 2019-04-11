package arrayBat;
/*Given 2 int arrays, a and b, of any length, return a new array with the first
  element of each array. If either array is length 0, ignore that array.*/
public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int[] c;
		if(a.length == 0 && b.length>0) {
			c = new int[1];
			c[0] = b[0];
		}else	if(b.length == 0 && a.length > 0) {
			c = new int[1];
			c[0] = a[0];
		}else if(a.length>0 && b.length>0) {
			c = new int[2];
			c[0] = a[0];
			c[1] = b[0];
		}else c = new int[0]; 
		return c;
	}
}
