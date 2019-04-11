package warmupBat;
/*Given a string, take the first 2 chars and return the string with the 2 chars
 *added at both the front and back, so "kitten" yields"kikittenki". If the 
 *string length is less than 2, use whatever chars are there.*/
public class Front22 {
	public String front22(String str) {
		if(str.length()<2)
			 return str+str+str;
		 return str.substring(0,2)+str+str.substring(0,2);
		
	}
	public static void main(String[] args) {
		Front22 g = new Front22();
		System.out.println(g.front22("k"));

	}

}
