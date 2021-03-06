interface Printable {
	public void print(String doc);
	default public void printCMYK(String doc){
		System.out.println("New default Printer");
		System.out.println(doc);
	}
}

interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

class VUpSPrinter implements ColorPrintable {

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Old SamsungPrinter");
		System.out.println();
	}

	@Override
	public void printCMYK(String doc) {
		// TODO Auto-generated method stub
		System.out.println("New SamsungPrinter");
		System.out.println();
	}
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

		System.out.println();
		Printable ap = (doc) -> {
			System.out.println("만들면서 정의 되는 함수");
			System.out.println("doc = " + doc);
		};
		ap.print("this is report");
		
		VUpSPrinter bsp = new VUpSPrinter();
		bsp.print("this is report");
		bsp.printCMYK("this is report");
	}
}
