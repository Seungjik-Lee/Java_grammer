class StaticValues {
	static int A = 10;
	int b = 20;
}

class A {
	public void doPrintStaticA() {
		System.out.println("SV.A = " + StaticValues.A++);

		StaticValues sv = new StaticValues();
		System.out.println("SV.b = " + sv.b++);
	}
}

class B {
	public void doPrintStaticA() {
		System.out.println("SV.A = " + StaticValues.A++);
	}
}

public class Ex01 {

	/*
	 * ������ ���� ���� ����, ���α׷� ���ۿ��� ����ñ��� ���� ���� �Լ����� �⺻������ ����ÿ� ����ϰ� �Լ� ������ �� �޸𸮿���
	 * ���� �� ���� molloc calloc realloc free �����ڰ� ����ؼ� ���� �޸� �Ҵ� �� ����
	 */

	public static void main(String[] args) {
		A a = new A();
		a.doPrintStaticA();
		B b = new B();
		b.doPrintStaticA();

		System.out.println("SV.A = " + StaticValues.A);
	}
}
