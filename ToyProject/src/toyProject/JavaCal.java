package toyProject;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JavaCal extends JFrame{
	JTextField inputText;
	
	public JavaCal() {
		super("자바 계산기");
	
	BorderLayout layout = new BorderLayout(2,2) ;// 상하 좌우 간격이 2 인 레이아웃 생성 
	setLayout(layout);   // 레이아웃 설정 
	
	inputText = new JTextField("", SwingConstants.CENTER);// 텍스트 필드를 중앙에
	inputText.setHorizontalAlignment(JTextField.RIGHT);  // 숫자는 오른쪽에 보이게 
	inputText.setFont(new Font(Font.SERIF, Font.BOLD ,40)); // 숫자를 나타내는 글씨체,크깅
	inputText.setBounds(0,0,450,50); // 텍스트 필드의 위치 크기 
	
	add(inputText, BorderLayout.NORTH) ; // 북쪽 , 즉 상단에 텍스트 필드 부착 
	}
	
	public static void main(String[] args) {
		JavaCal cal = new JavaCal();
		
		cal.setSize(300,400);  //계산기의 크기 (가로, 세로 ) 
		cal.setResizable(false);  // 계산기 크기 고겆ㅇ 
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setVisible(true);
	}

}
