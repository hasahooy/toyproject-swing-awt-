package toyProject;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*; 
import java.io.*; 


public class SwingPuppy2 extends JFrame{

	Image img = null; 
	JLabel label, attr;
	String name , color , specialty;
	int age ; 
	
	
	public SwingPuppy2() {
		super("Puppy");
		
		name ="멍뭉이" ; 
		color = "갈색";
		specialty = "손, 두발로 서기" ; 
		age = 1; 
		
		try {
			File sourceimage = new File("puppy.jpg");
			img = ImageIO.read(sourceimage);
		}catch(IOException e) { 
			System.out.println("이미지 파일이 없습니다");
		}
		
		label = new  JLabel(new ImageIcon(img));
		attr = new JLabel(); 
		
		add(label, BorderLayout.CENTER);
		add(attr, BorderLayout.WEST);
		
		setSize(500,400); // 창크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true) ;
	}
	public void showAttr() {
		String prop = "<html> 이름: "+ name 
					+ "<br>나이: " + age  +"살 "
					+ "<br>색깔 : " +color 
					+ "특기 : " +specialty;
		
		attr.setText(prop);
	}
	
	
	public static void main(String[] args) {
		SwingPuppy2 pup2 = new SwingPuppy2(); 
		pup2.showAttr();
	}

}
