package stringBat2;
/*Return true if the string "cat" and "dog" appear the same number of times in
 *the given string.*/
public class CatDog {
	public boolean catDog(String str) {
		String cat = "cat"; String dog = "dog";
		int countCat = 0, countDog = 0;
		for (int i = 0; i < str.length()-2; i++) {
			if(cat.equals(str.substring(i, i+3)))
				countCat++;
			if(dog.equals(str.substring(i, i+3)))
				countDog++;
		}
		return countCat==countDog;

	}
	public static void main(String[] args) {
		CatDog g = new CatDog();
		System.out.println(g.catDog("1cat1cadodog"));
	}

}
