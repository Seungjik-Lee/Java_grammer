import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		switch (n) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
			System.out.println("20�̻� 30�̸��� ��");
			break;
		default:
			System.out.println("���� Ȥ�� 30�̻��� ��");
		}
	}
}