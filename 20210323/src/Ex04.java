//import aa.bb.Printable;
class Sprin implements aa.bb.Printable {
	@Override
	public void print(String doc) {
		System.out.println("Sprin");
		System.out.println(doc);
	}
}

class Mprin extends Sprin {
	@Override
	public void print(String doc) {
		System.out.println("Mprin");
		System.out.println(doc);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		aa.bb.Printable prin1 = new Sprin();
		aa.bb.Printable prin2 = new Mprin();

		if (prin1 instanceof aa.bb.Printable)
			prin1.print("부모객체에 담을수 있다. 재정의된 함수 print호출");
		if (prin2 instanceof aa.bb.Printable)
			prin2.print("부모객체에 담을수 있다. 재정의된 함수 print호출");
	}
}
