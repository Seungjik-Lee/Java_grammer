
public class Prob10 {
	public static void main(String[] args) {

		for (int i = 2; i < 9; i = i + 2) {
			for (int j = 1; j < i + 1; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
