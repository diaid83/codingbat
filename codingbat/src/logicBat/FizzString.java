package logicBat;
/*Given a string str, if the string starts with "f" return "Fizz". If the 
 * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
 *  true, return "FizzBuzz". In all other cases, return the string unchanged*/
public class FizzString {
	public String fizzString(String str) {
		if(str.startsWith("f")&&str.endsWith("b")) {
			return "FizzBuzz";
		}else if (str.startsWith("f")){
			return "Fizz";
		}else if(str.endsWith("b")) {
			return "Buzz";
		}
		return str;
		/*boolean f = str.startsWith("f");
		  boolean b = str.endsWith("b");
		  
		  if (f && b) return "FizzBuzz";
		  if (f) return "Fizz";
		  if (b) return "Buzz";
		  return str;*/
	}
	public static void main(String[] args) {
		FizzString g = new FizzString();
		System.out.println(g.fizzString("fig"));
	}

}
