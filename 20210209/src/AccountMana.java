class Account {
	String accNumber; // ���¹�ȣ
	String ssNumber; // �ֹε�Ϲ�ȣ
	int balance; // �ݾ�

	//�ٸ� �����ڸ� �����ϰ� �Ǹ� �⺻�����ڰ� �������� ������ �ִ�.
	public Account(){}
	
	public Account(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	// public void initAccount(String acc, String ss, int bal){
	// accNumber = acc;
	// ssNumber = ss;
	// balance = bal;
	// }

	public void checkAccount() {
		System.out.println("���¹�ȣ = " + accNumber);
		System.out.println("�ֹε�Ϲ�ȣ = " + ssNumber);
		System.out.println("�ݾ� = " + balance);
	}
}

public class AccountMana {
	public static void main(String[] args) {
		
		Account acc1 = new Account("12-34-56", "123456-123456", 100000);
		Account acc2 = new Account("65-43-21", "654321-654321", 200000);
		
		acc1.checkAccount();
		acc2.checkAccount();
		
//		Account acc1 = new Account();
//		Account acc2 = new Account();

//		acc1.checkAccount();
//		acc2.checkAccount();

//		acc1.initAccount("12-34-56", "123456-123456", 100000);
//		acc2.initAccount("65-43-21", "654321-654321", 200000);
//
//		acc1.checkAccount();
//		acc2.checkAccount();
	}
}
