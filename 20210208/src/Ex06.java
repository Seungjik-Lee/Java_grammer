class BB {
	public int a = 10;
	public int b = 20;

	public void doA() {
		System.out.println("doA 매서드 입니다.");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		BB b = new BB();
		System.out.println("b.a = " + b.a);
		System.out.println("b.b = " + b.b);
		b.doA();
	}
}
