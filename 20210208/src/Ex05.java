
public class Ex05 {

	public static String doA(int a) {
		System.out.println("���丮�� �Լ�");

		if (a > 0) {
			return a+"*"+doA(a - 1);
		} else {
			return "1";
		}
	}

	public static void main(String[] args) {
//		int returnValue = doA(5);
		System.out.println("returnValue = " + doA(5));
	}
}
