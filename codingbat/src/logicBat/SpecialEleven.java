package logicBat;
/*We'll say a number is special if it is a multiple of 11 or if it is one more
 *than a multiple of 11. Return true if the given non-negative number is 
 *special. Use the % "mod" operator */
public class SpecialEleven {
	public boolean specialEleven(int n) {
		return (n%11==0||n%11==1);	  
		
	}
	public static void main(String[] args) {
		SpecialEleven g = new SpecialEleven();
		System.out.println(g.specialEleven(23));
	}

}
