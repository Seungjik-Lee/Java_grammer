
/*
 * �ΰ��� ������ �Է� �޾Ƽ� �μ��� ���� ����ϴ� ���α׷��� �����غ���.
 * �� ������ ū ������ ���� ���� �� ����� ��� �ؾ��Ѵ�.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a ���� �Է� : ");
		int a = scan.nextInt();
		System.out.println("b ���� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		if (a > b) {
			System.out.println("a - b = " + (a - b));
		} else {
			System.out.println("b - a = " + (b - a));
		}
	}

}