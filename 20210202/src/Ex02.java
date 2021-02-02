
public class Ex02 {
	public static class Ex01 {
		public static void main(String[] args) {
			System.out.println("프로그램 시작");
			doA(12);
			doA(13, 180);
			System.out.println("프로그램 끝");
		}

		public static void doA(int age) {
			System.out.println("doA 시작");
			System.out.println("age = " + age);
			System.out.println("doA 끝");
		}

		public static void doA(int age, int height) {
			System.out.println("doA 시작");
			System.out.println("age = " + age);
			System.out.println("height = " + height);
			System.out.println("doA 끝");
		}

	}

}
