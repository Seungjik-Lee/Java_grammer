
public class Ex02 {
	public static class Ex01 {
		public static void main(String[] args) {
			System.out.println("���α׷� ����");
			doA(12);
			doA(13, 180);
			System.out.println("���α׷� ��");
		}

		public static void doA(int age) {
			System.out.println("doA ����");
			System.out.println("age = " + age);
			System.out.println("doA ��");
		}

		public static void doA(int age, int height) {
			System.out.println("doA ����");
			System.out.println("age = " + age);
			System.out.println("height = " + height);
			System.out.println("doA ��");
		}

	}

}
