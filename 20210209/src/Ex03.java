class AA {
	// �����ڴ� �޼ҵ�� ��������� �����ڴ� ��ȯ�Ǵ� ���� ����.
	// �����ڴ� Ŭ���� ���̶� �����ؾ� �Ѵ�.
	// �޼ҵ� �����ε��� �޼ҵ� ���̶� ������ �Ű�����(�Ķ��Ÿ)�� �ٸ��� �ٸ� �޼ҵ�� ����.
	public AA() {
		System.out.println("AA ������");
	}

	public AA(int a) {
		System.out.println("a �Ķ��Ÿ �ִ� ������ a = " + a);
	}
}

class BB {
	public BB() {
		System.out.println("BB ������");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// �޸𸮿� �ø��� �����ڸ� ȣ�� �Ѵ�.
		AA a1 = new AA();
		System.out.println(a1);
		AA a2 = new AA(10);
		System.out.println(a2);
		new BB();
	}
}