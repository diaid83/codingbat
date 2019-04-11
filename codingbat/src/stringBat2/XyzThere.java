package stringBat2;
/*Return true if the given string contains an appearance of "xyz" where the xyz is
 *not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.*/
public class XyzThere {
	public boolean xyzThere(String str) {
		//return str.contains("xyz")&&!str.contains(".xyz"); 
		for(int i = 0; i < str.length() - 2; i++){
			if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2)
			 == 'z'){
				if(i == 0 || str.charAt(i-1) != '.')
					return true;
			}
		}
	return false;
	}
	public static void main(String[] args) {
		XyzThere g = new XyzThere();
		System.out.println(g.xyzThere(".xyz"));

	}

}
