package toyProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNum {
	public static void main(String[] args) {
		JFrame f = new JFrame("덧셈 연산기"); 
		JTextField tf = new JTextField(); 
		JTextField tf1 = new JTextField(); 
		JLabel sum = new JLabel(); 
		
		tf.setBounds(50,50,150,20);
		tf1.setBounds(50,80,150,20);
		sum.setBounds(50,110,150,20);
		JButton b = new JButton("덧셈연산");
		b.setBounds(50,140,95,20);
		b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(tf.getText());
			int num1 = Integer.parseInt(tf1.getText());
			int result = num + num1;
			 	sum.setText(""+result);
	 }
	});
		
	f.add(b); f.add(tf) ; f.add(tf1); f.add(sum);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
