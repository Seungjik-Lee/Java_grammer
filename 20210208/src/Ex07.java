
public class Ex07 {
	int a = 10;

	public void doA() {
		a++;
	}

	public void doB() {
		a = 20;
	}

	public static void main(String[] args) {
		Ex07 e7 = new Ex07();
		System.out.println("e7.a = " + e7.a);
		e7.doA();
		System.out.println("e7.a = " + e7.a);
		e7.doB();
		System.out.println("e7.a = " + e7.a);
	}
}
