
/*
 * 화면구현하는 GUI -> 그래픽 사용자 도구
 * 
 * Java -> JFrame
 * C# -> Form
 * Python -> pyQt5, matplotlib.pyplot
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex01 extends JFrame {

	JButton btn1 = new JButton("입력");
	DataBaseManager dbm = new DataBaseManager();
	public static JTextField tf_IDX;
	public static JTextField tf_NAME;
	public static JTextField tf_GENDER;
	public static JTextField tf_REMARK;

	Ex01() { // Ex01 은 JFrame 이다
		getContentPane().setLayout(null); // 버튼 꽉 차는 것 지우기
		
		JLabel lblIdx = new JLabel("IDX");
		lblIdx.setBounds(20, 60, 100, 30);
		getContentPane().add(lblIdx);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(20, 100, 100, 30);
		getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(20, 140, 100, 30);
		getContentPane().add(lblGender);
		
		JLabel lblRemark = new JLabel("REMARK");
		lblRemark.setBounds(20, 180, 100, 30);
		getContentPane().add(lblRemark);
		
		tf_IDX = new JTextField();
		tf_IDX.setBounds(122, 65, 116, 21);
		getContentPane().add(tf_IDX);
		tf_IDX.setColumns(10);
		
		tf_NAME = new JTextField();
		tf_NAME.setColumns(10);
		tf_NAME.setBounds(122, 100, 116, 21);
		getContentPane().add(tf_NAME);
		
		tf_GENDER = new JTextField();
		tf_GENDER.setColumns(10);
		tf_GENDER.setBounds(122, 140, 116, 21);
		getContentPane().add(tf_GENDER);
		
		tf_REMARK = new JTextField();
		tf_REMARK.setColumns(10);
		tf_REMARK.setBounds(122, 180, 116, 21);
		getContentPane().add(tf_REMARK);
		
//		btn1.addActionListener(new ActionListener() {
//		});
//		btn1.addActionListener(new ActionListener() {
//		});
		btn1.setBounds(372, 521, 100, 30);
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("이거는 인터페이스");
//			}
//		});

		btn1.addActionListener((e) -> {
			System.out.println("랄다...");
		});
		btn1.addActionListener(dbm);

		super.add(btn1);

		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// for (int i = 0; i < 10; i++) {
		// JFrame jf = new JFrame(i + "");
		// jf.setSize(500, 600);
		// jf.setVisible(true);
		// }
	}

	public static void main(String[] args) {

		new Ex01();
	}
}
