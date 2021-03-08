class Printer {
	public void doA() {
		System.out.println("doA 함수");
	}

	public void doB() {
		System.out.println("doB 함수");
	}

	public static void doC() {
		System.out.println("doC 함수");
	}

	public static void doD() {
		System.out.println("doD 함수");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Printer pi = new Printer();
		pi.doA();
		pi.doB();
		
		Printer.doC(); //이게 표준 , pi 객체를 힙 영역 메모리 할당을 하지 않고 바로 호출
		Printer.doD();
	}
}
