/*
 * 1�̻� 100�̸��� �����߿��� 7�� ����� 9�� ����� ����ϴ� ���α׷��� �ۼ��غ���.
 * ��! 7�� ����̸鼭 ���ÿ� 9�� ����ΰ��� �ѹ��� ���
 */
public class Ex01 {

	public static void main(String[] args) {
		int i = 1;
		while (i < 100) {
			i++;
			System.out.println(i % 7 == 0 ? "i = " + i : "");
			System.out.println(i % 9 == 0 ? "i = " + i : "");

			if (i % 7 == 0) {
				System.out.println("i = " + i);
				continue;
			}
			if (i % 9 == 0) {
				System.out.println("i = " + i);
			}

		}
	}
}
