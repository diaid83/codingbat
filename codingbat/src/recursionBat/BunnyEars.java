package recursionBat;
/*We have a number of bunnies and each bunny has two big floppy ears. We want to
 *compute the total number of ears across all the bunnies recursively (without
 *loops or multiplication).*/
public class BunnyEars {
	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		return 2 + bunnyEars(bunnies-1);
	}
	public static void main(String[] args) {
		BunnyEars g =  new BunnyEars();
		System.out.println(g.bunnyEars(10));
	}
}
