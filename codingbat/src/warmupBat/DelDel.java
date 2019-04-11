package warmupBat;
/*Given a string, if the string "del" appears starting at index 1, return a
 *string where that "del" has been deleted. Otherwise, return the string
 * unchanged.*/
public class DelDel {
	public String delDel(String str) {
		if(str.length()<4)
			return str;
		if(str.startsWith("del", 1))
			return str.charAt(0)+str.substring(4, str.length());
		return str;
	}

	public static void main(String[] args) {
		DelDel g = new DelDel();
		System.out.println(g.delDel("adelHello"));

	}

}
