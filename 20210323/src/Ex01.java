interface A{
	public void doA(String a);
}

public class Ex01 implements A{
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.doA("test");
		
		A a1 = new A(){
			public void doA(String s){
				
			}
		};
		
		A a2 = (s)->{}; // 람다 문법
		
	}

	@Override
	public void doA(String a) {
		// TODO Auto-generated method stub
		System.out.println("doA 함수입니다.");
	}
}
