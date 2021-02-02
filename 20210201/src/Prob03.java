import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("숫자 입력 : ");
		n = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println("Simple Java");
		} else if (n == 2) {
			System.out.println("Funny Java");
		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming Language");
		}
		System.out.println("Do you like Java?");
	}
}
