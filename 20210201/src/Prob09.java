
public class Prob09 {
	public static void main(String[] args) {
		int total = 1;

		for (int i = 1; i < 11; i++) {
			total *= i;
		}
		System.out.println("1부터 10까지의 곱은  = " + total);

		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
	}
}
