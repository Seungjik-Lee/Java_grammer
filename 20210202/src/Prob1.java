
public class Prob1 {
	public static void main(String[] args) {

		add(15, 4);
		sub(15, 4);
		div(15, 4);
		res(15, 4);
	}

	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	public static void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}

	public static void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}

	public static void res(int num1, int num2) {
		int result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
	}
}
