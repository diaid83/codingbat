package stringsBat;
/*Given a string, return true if the first 2 chars in the string
 *also appear at the end of the string, such as with "edited".*/
public class FrontAgain {
	public boolean frontAgain(String str) {
		return str.substring(0, 2).equals(str.substring(str.length()-2));
		/*if (str.length()<2) {
			return false;
		}else if(str.substring(0, 2).equals(str.substring(str.length()-2))){  
			return true;
		}else return false;*/
	}
	public static void main(String[] args) {
		FrontAgain g = new FrontAgain();
		System.out.println(g.frontAgain("ee"));
	}
}

