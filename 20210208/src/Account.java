
public class Account {
	String name;
	int al = 10;

	public void setName(String a) {
		name = a;
	}

	// al ����
	public void setAl(int value) {
		al = value;
	}

	// al ���
	public void printAl() {
		System.out.println("name = " + name);
		System.out.println("al = " + al);
	}
}
