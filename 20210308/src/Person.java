//import java.lang.*; //생략 가능

class AAAA{
	AAAA(){
		System.out.println("상위 클래스 생성자");
	}
}


public class Person extends AAAA {
	private String name;
	private int age;

	// 생서자 오버로딩
	public Person(){
		super(); // 생략가능 생성자 호출시에 바로 그 다음줄에 위치
	}
	
	public Person(String name, int age) {
		super(); // 생략가능
		this.name = name;
//		this.age = age;
		age = age;
	}

	public void doPrint(){
		System.out.println("name = "+name);
		System.out.println("age = " + age);
	
		// 생성자 자동 만들기 alt+shift+s+o
	}
}
