package toyProject;

import javax.swing.*;
import java.awt.*;

public class ball {
	public static void main(String[] args) {
		JFrame f = new JFrame("첫번째 AWT");  //라베을 붙일 프레임을 생성
		JLabel l1 = new JLabel("안녕하세요."); //라벨 생성후 글쓰기 
		l1.setBounds(50,50,300,40); // 라벨의 위치 , 크기 지정 
		l1.setFont(new Font("굴림", Font.BOLD,30)); //폰트 설정 
		f.add(l1);  //프레임에 라벨 붙이기 
		f.setSize(300,300);  // 프레임 크기 설정 
		//f.setLayout(new FlowLayout());  // 기본 레이아웃 사용 
		f.setLayout(null);
		f.setVisible(true);  // 프레임 보이기 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클릭시 종료   
	
	}
}
