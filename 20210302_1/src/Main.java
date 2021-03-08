import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/*
	 * 1. �л���� 2. �л���ȸ
	 * 
	 * 3. �л����� 4. �л����� 5. �л� ���Ϸ� ����
	 */

	public static void main(String[] args) {

		Student[] student = new Student[50];

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. �л���� 2. �л���ȸ 3. �л����� 4. �л�����");
			int select = scan.nextInt();
			System.out.println("select = " + select);
			if (select == 1) {
				// �л����
				scan.nextLine();
				System.out.println("�̸���? ");
				String name = scan.nextLine();
				System.out.println("������? ");
				String gender = scan.nextLine();
				System.out.println("����?");
				int age = scan.nextInt();
				for (int i = 0; i < student.length; i++)
					if (student[i] == null) {
						student[i] = new Student(name, gender, age);
						break;
					}
			} else if (select == 2) {
				// �л� ��ȸ
				System.out.println("===�л���ȸ===");
				for (int i = 0; i < student.length; i++) {
					System.out.println(i + " = " + student[i]);
					if (student[i] != null)
						student[i].print();
				}
				System.out.println("============");
			} else if (select == 3) {
				// �л� ����
				System.out.println("�����ϰ� ���� ��ȣ �Է� : ");
				int num = scan.nextInt();

				scan.nextLine();// �Է¹��� ����
				System.out.println("�̸���? ");
				String name = scan.nextLine();
				System.out.println("������? ");
				String gender = scan.nextLine();
				System.out.println("����?");
				int age = scan.nextInt();

				student[num] = new Student(name, gender, age);
				System.out.println("���� �Ǿ����ϴ�.");
			} else if (select == 4) {
				// �л� ����
				System.out.println("�����ϰ� ���� �л� ��ȣ �Է� : ");
				int num = scan.nextInt();
				student[num] = null;
				System.out.println("���� �Ǿ����ϴ�.");
			} else {
				System.out.println("����˴ϴ�.");
				break;
			}
		}
	}
}
