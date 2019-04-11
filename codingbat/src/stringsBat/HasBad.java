package stringsBat;
/*Given a string, return true if "bad" appears starting at index 0 or 1 in  
 *the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string
 *may be any length, including 0.Note: use .equals() to compare 2 strings.*/
public class HasBad {
	public boolean hasBad(String str) {
		return str.startsWith("bad")||str.startsWith("bad", 1);
		/*if(str.startsWith("bad")||str.startsWith("bad", 1)){
			return true;
		}else return false;*/
	}
	public static void main(String[] args) {
		HasBad g = new HasBad();
		System.out.println(g.hasBad("sbadminton"));
	}
}
