package toyProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*; 

public class SwingPuppy1 extends JFrame {
	Image img = null; 
	JLabel label ;
	
	public SwingPuppy1() {
		super("Puppy");
		
		try {
			File sourceimage = new File("puppy.jpg");
			img = ImageIO.read(sourceimage);
		}catch(IOException e) {
			System.out.println("이미지파일이 없습니다.");
		}
		
		label = new  JLabel(new ImageIcon(img));
		add(label, BorderLayout.CENTER);
		
		setSize(500,400); // 창크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
	}
	
	
	public static void main(String[] args) {
		SwingPuppy1 pup1 = new SwingPuppy1();
	}

}
