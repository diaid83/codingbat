package stringsBat;
/*Given two strings, a and b, return the result of putting them together
in the order abba, 	e.g. "Hi" and "Bye" returns "HiByeByeHi".*/
public class MakeAbba {
	public String makeAbba(String a, String b) {
		return a+b+b+a;
	}
	public static void main(String[] args) {
		MakeAbba g = new MakeAbba();
		System.out.println(g.makeAbba("hi", "bye"));
	}
}
