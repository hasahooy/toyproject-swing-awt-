package toyProject;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class JavaCal1 extends JFrame{

	JTextField inputText; 
	String names[] = {"C","/","*","-","7","8","9","+","4","5","6","=","1","2","3","0"};
	
	JavaCal1(){
		super ("자바 계산기 ");
		
		BorderLayout layout =new BorderLayout(2,2);
		setLayout(layout);
		
		inputText = new JTextField("", SwingConstants.CENTER);// 텍스트 필드를 중앙에
		inputText.setHorizontalAlignment(JTextField.RIGHT);  // 숫자는 오른쪽에 보이게 
		inputText.setFont(new Font(Font.SERIF, Font.BOLD ,40)); // 숫자를 나타내는 글씨체,크깅
		inputText.setBounds(0,0,450,50); // 텍스트 필드의 위치 크기 
		
		JPanel pad = new JPanel(new GridLayout(4,4)); // 키패드를 담을 패널 생성 
		JButton buttons[] = new JButton[names.length]; // 버튼의 숫자는 배열크기와 동일 
		
		for(int count =0; count <names.length; count++) //버튼을 키패드에 붙이기 
		{
			buttons[count] = new JButton(names[count]);
			pad.add(buttons[count]);
			PadInput handler =new PadInput(); //이너 클래스 PadInput 생성
			buttons[count].addActionListener(handler);
		}
		
		add(inputText, BorderLayout.NORTH);
		add(pad, BorderLayout.CENTER);
	}
	class PadInput implements ActionListener {
	    public void actionPerformed(ActionEvent event) {
	       String eventText = event.getActionCommand();
	  
	   inputText.setText(inputText.getText()+event.getActionCommand());
	  } 

	} 
	public static void main(String[] args) {
		JavaCal1 cal = new JavaCal1();   // 클래스명 수정 필요 
	
		cal.setSize(300,400);
		cal.setResizable(false);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setVisible(true);
	}

}
