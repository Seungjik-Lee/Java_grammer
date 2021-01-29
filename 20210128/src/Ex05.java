import java.util.Scanner;

/*
 * 문제
 * 소수 둘째자리까지 입력 받아서 소수 첫째자리까지 출력하세요.
 * 예시
 * 숫자 입력 : 21.234
 * 출력 : 21.23
 * 
 * -->힌트
 * double형은 int형으로 바꿀 때 소수점이 삭제 된다.
 * 21.234 -> int 21
 * 212.34 -> int 212
 * 2123.4 -> int 2123
 * 
 */

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("더블형 숫자 입력 : ");
		double a = scan.nextDouble();
		System.out.println("a = "+a);
		
		a = a*100;
		System.out.println("a = "+a);
		int b = (int)a;
		System.out.println("b = "+b);
		double c = (double)b/100;
		System.out.println("출력 \n c = "+c);
		
	}
}
