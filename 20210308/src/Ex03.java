class Printer {
	public void doA() {
		System.out.println("doA �Լ�");
	}

	public void doB() {
		System.out.println("doB �Լ�");
	}

	public static void doC() {
		System.out.println("doC �Լ�");
	}

	public static void doD() {
		System.out.println("doD �Լ�");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Printer pi = new Printer();
		pi.doA();
		pi.doB();
		
		Printer.doC(); //�̰� ǥ�� , pi ��ü�� �� ���� �޸� �Ҵ��� ���� �ʰ� �ٷ� ȣ��
		Printer.doD();
	}
}
