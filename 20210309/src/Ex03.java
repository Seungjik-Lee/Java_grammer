
public class Ex03 {

	public static void main(String[] args) {
//		int *a = "string";
//		a[0] = 'a';
//		
//		int b[10] = "string";
//		b[0] = 'a';
		
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str3.equals(str4))
			System.out.println("���� ���̴�.");
		
		if(str1 == str2)
		{
			System.out.println("������ �ּҰ�");
		}
		
		if(str3 == str4)
		{
			
		}
		else{
			System.out.println("�ٸ� �ּҰ�");
		}
	}
}
