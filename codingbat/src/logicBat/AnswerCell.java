package logicBat;
/*Your cell phone rings. Return true if you should answer it. Normally you 
 *answer, except in the morning you only answer if it is your mom calling.
 *In all cases, if you are asleep, you do not answer.*/
public class AnswerCell {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(isAsleep) 
			return false;
		if(isMorning)
			return isMom;
		return true;

	}
	public static void main(String[] args) {
		AnswerCell g = new AnswerCell();
		System.out.println(g.answerCell(true, true, true));

	}

}
