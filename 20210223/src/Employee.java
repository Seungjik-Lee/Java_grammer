public class Employee {
	
	private String name;
	private String Jumin;
	private int sal;
	public void setName(String name){
		this.name = name;
	}
	// alt + shift + s -> r
	
	public void doPrint(){
		System.out.println("�̸�"+name);
		System.out.println("�ֹ�"+Jumin);
		System.out.println("����"+sal);
	}
/* 
 private �������������� ����
 	1.setName...
 	2.�����ڷ�..
*/
	public void setJumin(String jumin) {
		Jumin = jumin;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
