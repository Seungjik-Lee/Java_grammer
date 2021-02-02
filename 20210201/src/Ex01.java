/*
 * 1이상 100미만인 정수중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성해보자.
 * 단! 7의 배수이면서 동시에 9의 배수인것은 한번만 출력
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
