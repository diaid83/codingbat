package stringBat2;
/*Given two strings, a and b, create a bigger string made of the first char of a,
 *the first char of b, the second char of a, the second char of b, and so on. Any
 *leftover chars go at the end of the result.*/
public class MixString {
	public String mixString(String a, String b) {
		String end = ""; String max = "";
		int j = 0; int x = a.length()-1; int y = b.length()-1;
		if(x==y) {
			j = x;
		}
		if(x<y) {
			j = x;
			end = b.substring(x+1);

		}else{
			j = y;
			end = a.substring(y+1);
		}
		for(int i=0;i<=j;i++)
			max = max + a.charAt(i)+b.charAt(i);
		return max + end;
	} 
	public static void main(String[] args) {
		MixString g = new MixString();
		System.out.println(g.mixString("xxxx", "There"));


	}

}
