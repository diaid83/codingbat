package warmupBat;
//Given a string, return true if the string starts with "hi" and false otherwise.
public class StartHi {
	public boolean startHi(String str) {
		  return str.startsWith("hi");
	}
	public static void main(String[] args) {
		StartHi g = new StartHi();
		System.out.println(g.startHi("hi"));

	}

}
