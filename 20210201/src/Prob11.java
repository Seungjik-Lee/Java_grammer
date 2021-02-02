
public class Prob11 {
	public static void main(String[] args) {
		int a = 0;
		int b = 9;

		while (a < 10) {
			a++;
			b--;
			if ((a + b) == 9) {
				System.out.println("a = " + a);
				System.out.println("b = " + b);
			}
		}
	}
}
