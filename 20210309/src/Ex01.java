class A{
	public static int a = 10;
	public static void doA(){
		System.out.println("static doA �Դϴ�.");
	}
	private void doB(){
		System.out.println("private doB�Դϴ�");
	}
	public void doC(){
		doB();
		System.out.println("public doC�Դϴ�");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A.doA();
		System.out.println(A.a);
		A a = new A();
//		a.doB();
		a.doA();
		a.doC();
		
		// Thread ��� �͵��� �𿩼� ���μ����� �˴ϴ�.
		
		Thread th = new Thread(new Runnable() {
			public void run() {
				for(int i= 0; i<10000; i++){
					System.out.println("th i = "+i);
				}
			}
		});
		th.start();
		
		Thread ath = new Thread(new Runnable() {
			public void run() {
				for(int k= 0; k<10000; k++){
					System.out.println("ath k = "+k);
				}
			}
		});
		ath.start();
	}
}














