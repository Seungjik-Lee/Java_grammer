class AA {
}

public class Ex01 {
	Ex01() {
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("arr[i] = " + arr[i]);
		}

		String string_arr[] = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("string_arr[i] = " + string_arr[i]);
		}

		AA aa_arr[] = new AA[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("aa_arr[i] = " + aa_arr[i]);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
