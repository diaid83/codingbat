package warmupBat;
/*The parameter weekday is true if it is a weekday, and the parameter vacation
 *is true if we are on vacation. We sleep in if it is not a weekday or we're
 *on vacation. Return true if we sleep in.*/
public class SleepIn {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(vacation)
			return true;
		if(weekday)
			return false;
		return true;	
	}
	/*if (!weekday || vacation) {return true;}return false;*/
	public static void main(String[] args) {
		SleepIn g = new SleepIn();
		System.out.println(g.sleepIn(true, false));

	}

}
