package toyProject;

import javax.swing.*;
import java.awt.event.*;


public class JButtonTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("버튼 예제");
		JTextField tf= new JTextField();
		tf.setBounds(50,50,180,20);
		JButton b = new JButton(new ImageIcon()); //이미지버튼 생성 
		b.setBounds(80,100,90,30);
		b.addActionListener(new ActionListener(){ //액션리스너 붙이기 
			public void actionPerformed(ActionEvent e) {  // 클릭시 작동되는 함수 구현
				tf.setText("버튼이 클릭되었습니다.");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
