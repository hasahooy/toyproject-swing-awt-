package toyProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OpenNum {
	public static void main(String[] args) {
		JFrame f = new JFrame("사칙 연산기");  // 프로그램 이름  
		JTextField tf = new JTextField();   // 입력창1 
		JTextField tf1 = new JTextField();  // 입력창2 
		JLabel sum = new JLabel();  // 결과 라벨 
		
		tf.setBounds(50,50,150,20);   // 입력창 위치와 크기 
		tf1.setBounds(50,80,150,20);  // 옆으로 50 , 아래로 80 위치에 생성 
		sum.setBounds(50,110,150,20);  // 가로 150 . 세로 20 의 크기로 생성 
		  
		JButton b = new JButton("+");  // 버튼 이름 
		b.setBounds(50,140,50,30);  // 버튼 크기와 위치 
		b.addActionListener(new ActionListener() {   // 버튼에 이벤트 리스너 붙이기 
	public void actionPerformed(ActionEvent e) { 
			int num = Integer.parseInt(tf.getText()); // 1번째 입력창 숫자 가져오기 
			int num1 = Integer.parseInt(tf1.getText());  // 2번째 입력한 숫자 가져오기 
			int result = num + num1; 			 // 더하기 
			 	sum.setText(""+result);  // 결과를 입력창에 보여주기 
	 }
	});
		
		JButton b1 =new JButton("-"); 
		b1.setBounds(100,140,50,30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tf.getText());
				int num1 = Integer.parseInt(tf1.getText());
				int result = num - num1; 
					sum.setText(""+result);
			}
		});
		
		JButton b2 =new JButton("*"); 
		b2.setBounds(150,140,50,30);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tf.getText());
				int num1 = Integer.parseInt(tf1.getText());
				int result = num * num1; 
					sum.setText(""+result);
			}
		});
		
		JButton b3 =new JButton("/"); 
		b3.setBounds(200,140,50,30);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tf.getText());
				int num1 = Integer.parseInt(tf1.getText());
				int result = num / num1; 
					sum.setText(""+result);
			}
		});
	
	f.add(b); f.add(b1);f.add(b2);f.add(b3);
	f.add(tf) ; f.add(tf1); f.add(sum);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
