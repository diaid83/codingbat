package warmupBat;
/*Return true if the given string begins with "mix", except the 'm' can be 
 * anything, so "pix", "9ix" .. all count.*/
public class MixStart {
	public boolean mixStart(String str) {
		  if (str.length()>=2 && str.substring(1, 3)=="ix")
			  return true;
		  return false;
			   
	}
	public static void main(String[] args) {
		MixStart g = new MixStart();
		System.out.println(g.mixStart("pix snacks"));

	}

}
