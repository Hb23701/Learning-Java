public class Loops {
	public static void main(String[] args) {
		int x = 1;

		while (x<11) {
			System.out.println("print out number between 1 to 10: " + x);
			x++;
		}

		for (;x>0; x--) {
			System.out.println("print out number between 10 to 1: " + x);
		}
		// print out the times table for 3 using a for and while loop
		int a = 0;
		for (; a<6; a++) {
			System.out.println("Multiple of 3:" + a*3 );
		}
		while (a<11) {
			System.out.println("Multiple of 3: " + a*3);
			a++;
		}
	}
}
