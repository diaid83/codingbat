package stringsBat;
//Given a string, return true if it ends in "ly".
public class EndsLy {
	public boolean endsLy(String str) {
		return str.endsWith("ly");
		/*if(str.endsWith("ly")) {
			return true;
		} else return false;*/
	}	
	public static void main(String[] args) {
		EndsLy g = new EndsLy();
		System.out.println(g.endsLy("oddle"));

	}

}
