
public class Student {
	private String name;
	private String gender;
	private int age;
	private int num;
	// 1 setter...
	// 2 �����ڷ�...
	public Student(String n,String g,int a){
		name = n;
		gender = g;
		age = a;
	}
	public void print(){
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
	}
}
