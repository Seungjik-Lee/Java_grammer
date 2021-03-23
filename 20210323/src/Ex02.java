interface AA {
	int a = 10; // (public static final)이 생략되어 있음 int a = 10 ;

	public void doA();
}

interface BB {
	int b = 20;

	public void doB();
}

public class Ex02 implements AA, BB {
	Ex02() {
		doA();
		doB();
	}

	public static void main(String[] args) {
		new Ex02();
	}

	@Override
	public void doB() {
		// TODO Auto-generated method stub
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
