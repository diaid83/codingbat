package logicBat;
/*When squirrels get together for a party, they like to have cigars. A squirrel
party is successful when the number of cigars is between 40 and 60,
inclusive. Unless it is the weekend, in which case there is no upper bound
on the number of cigars. Return true if the party with the given values 
is successful, or false otherwise.*/
public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if(isWeekend)
			return (cigars >= 40);
		return (cigars >= 40 && cigars <= 60);
	}
	public static void main(String[] args) {
		CigarParty g = new CigarParty();
		System.out.println(g.cigarParty(80, false));
	}
}
