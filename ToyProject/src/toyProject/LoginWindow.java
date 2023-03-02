package toyProject;

import javax.swing.*;
import java.awt.event.*; 

public class LoginWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 창 :");  // 프레임 생성 
		JLabel l1 = new JLabel("사용자: ");  // 사용자 라벨 
		l1.setBounds(20,20, 80,30);
		JTextField text = new JTextField(); // 사용자 입력창
		text.setBounds(100,20,100,30);  
		JLabel l2 = new JLabel("비밀번호: "); 
		l2.setBounds(20,75, 80,30);
		JPasswordField value = new JPasswordField(); //비밀번호 입력창
		value.setBounds(100,75,100,30);
		JButton b = new JButton("로그인");
		b.setBounds(100,120,80,30);
		
		f.add(l1); f.add(text) ; //프레임에 사용자 라벨 ,입력창 붙이기 
		f.add(l2); f.add(value); f.add(b); //프레임에 비밀번호 라벨 ,입력창 ,버튼 붙이기 
		f.setSize(300,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String data = "사용자:" +text.getText();  // 사용자명 추가 
				data += ", 비밀번호: "
						+new String(value.getPassword());
				JOptionPane.showMessageDialog(f, data);
  			}
		});
		
	}

}
