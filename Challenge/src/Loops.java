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
	}
}
