
public class Prob05 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (num < 100) {
			sum += num;
			num++;
		}
		System.out.println("1부터 99까지의 합 : " + sum);
	}
}
