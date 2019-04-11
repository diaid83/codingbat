package stringsBat;
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
public class HelloName {
	public String helloName(String name) {
		return "Hello "+name + "!";
	}

	public static void main(String[] args) {
		HelloName g = new HelloName();
		System.out.println(g.helloName("Nicole" + ""));

	}

}
