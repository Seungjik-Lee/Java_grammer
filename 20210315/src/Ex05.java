
public class Ex05 {

	private int sum = 0;

	Ex05() {
		int ar[] = { 5, 4, 3, 2, 1 };
		doPrintArr(ar);
	}

	public void doPrintArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println("sum = " + sum);
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
