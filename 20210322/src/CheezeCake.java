
public class CheezeCake extends Cake {
	@Override
	public void yummy() {
		super.yummy();
		System.out.println("CheezeCake");
	}
	
	public void A(){
		super.yummy();
		System.out.println("A함수");
		yummy();
	}
}
