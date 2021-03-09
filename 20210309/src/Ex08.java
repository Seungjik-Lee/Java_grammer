class Box {
	private String content;
	Box(){}
	Box(String content){
		this.content = content;
}
}

// alt + shift + s -> s toString �����
// alt + shift + s -> r getter setter �����
// alt + shift + s -> o ������ �����


/*
 * import java.lang.* 
 * toString() ����
 *  �⺻ ������ ����
 *   this ����
 */

public class Ex08 {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append("34");
		System.out.println(stb.toString());
		System.out.println(stb);

		Box box = new Box(); // �⺻ �����ڵ� ���� �Ǿ��� ǥ��.
		
		System.out.println(box);
		System.out.println(box.toString());
	}
}