class Box {
	private String content;
	Box(){}
	Box(String content){
		this.content = content;
}
}

// alt + shift + s -> s toString 만들기
// alt + shift + s -> r getter setter 만들기
// alt + shift + s -> o 생성자 만들기


/*
 * import java.lang.* 
 * toString() 생략
 *  기본 생성자 생략
 *   this 생략
 */

public class Ex08 {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append("34");
		System.out.println(stb.toString());
		System.out.println(stb);

		Box box = new Box(); // 기본 생성자도 생략 되어진 표현.
		
		System.out.println(box);
		System.out.println(box.toString());
	}
}
