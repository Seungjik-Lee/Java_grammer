import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);

			System.out.println("숫자입력");
			int n1 = scan.nextInt();

			System.out.println("숫자입력");
			int n2 = scan.nextInt();

			System.out.println("n1/n2 = " + (n1 / n2));
		} catch (Exception e) {
			System.out.println("캐치..");
		}
		
		System.out.println("예외적인 상황 발생시 종료");
		System.out.println("???");

	}
}