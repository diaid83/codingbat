package warmupBat;
/*Given two temperatures, return true if one is less than 0 and the other
 *is greater than 100.*/
public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		  return (temp1<0&&temp2>100)||(temp2<0&&temp1>100);
	}
	public static void main(String[] args) {
		IcyHot g = new IcyHot();
		System.out.println(g.icyHot(-30, 125));
				

	}

}
