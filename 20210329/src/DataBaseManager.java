import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

// 데이터베이스매니저 클래스는 액션리스너이다. is a 관계 성립
public class DataBaseManager implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 시도하라
		try {
//			int a = 1 / 0;
			// Oracle 연결하는 jar 파일 추가 확인
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "0으로 나눌 수 없다.");
		} catch (ClassNotFoundException cne) {
			JOptionPane.showMessageDialog(null, "클래스 없다.");
		}
		// 시도하다 예외상황이 발생하면 catch로 빠져라
		catch (Exception exc) {
			exc.printStackTrace(); // 몇 번째 줄에서 오류가 생겼는지 확인
		}
		System.out.println("데이터베이스매니저");
	}

}
