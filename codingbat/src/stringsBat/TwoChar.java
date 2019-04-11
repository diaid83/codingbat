package stringsBat;
/*Given a string and an index, return a string length 2 starting at the 
 *given index. If the index is too big or too small to define a string
 *length 2, use the first 2 chars. The string length will be at least 2.*/
   
public class TwoChar {
	public String twoChar(String str, int index) {
		if(index>str.length()-2||index<1) {
			return str.substring(0, 2);
		}else return str.substring(index, index+2);
	}		 
	public static void main(String[] args) {
		TwoChar g = new TwoChar();
		System.out.println(g.twoChar("Help", 1));
	}
}
