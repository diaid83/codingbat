package stringsBat;
/*Given a string, if the string begins with "red" or "blue" return that 
 *color string, otherwise return the empty string.*/
public class SeeColor {
	public String seeColor(String str) {
		 if(str.startsWith("red")) {
			 return "red";
		 }else if(str.startsWith("blue")) {
			 return "blue";
		 }else return "";
	}
	public static void main(String[] args) {
		SeeColor g = new SeeColor();
		System.out.println(g.seeColor("reddldblue"));
	}
}
