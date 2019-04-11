package stringsBat;
/*Given a string of odd length, return the string length 3 from its middle, 
 *so "Candy" yields "and". The string length will be at least 3.*/
public class MiddleThree {
	public String middleThree(String str) {
	return str.substring(str.length()/2-1, str.length()/2+2);  
	}
	
	public static void main(String[] args) {
		MiddleThree g = new MiddleThree();
		System.out.println(g.middleThree("Strings"));

	}

}
