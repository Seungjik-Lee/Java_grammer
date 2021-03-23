interface Printable {
	public void print(String doc);
}

class SPrinter implements Printable {

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Samsung Printer");
		System.out.println(doc);
	}
}

class LPrinter implements Printable {

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("LG printer");
		System.out.println(doc);
	}
}

public class MainPrinter {
	public static void main(String[] args) {
		SPrinter sp = new SPrinter();
		sp.print("this is report");
		System.out.println();

		LPrinter lp = new LPrinter();
		lp.print("this is report");
	}
}
