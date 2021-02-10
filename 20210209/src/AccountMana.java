class Account {
	String accNumber; // 계좌번호
	String ssNumber; // 주민등록번호
	int balance; // 금액

	//다른 생성자를 선언하게 되면 기본생성자가 없어지는 현상이 있다.
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
		System.out.println("계좌번호 = " + accNumber);
		System.out.println("주민등록번호 = " + ssNumber);
		System.out.println("금액 = " + balance);
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
