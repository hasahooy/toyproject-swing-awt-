package toyProject;
import javax.swing.*; 
import java.awt.event.*;


//메모장을 만들어보자 ! 
public class JavaNote implements ActionListener{
	JFrame f; // 프레임 변수
	JMenuBar mb; //메뉴바 변수 
	JMenu file,edit; //메뉴 변수 
	JMenuItem cut,copy,paste,selectAll,new1; // 메뉴항목 변수 
	JTextArea ta;  // 텍스트 에어리어 변수 
	
	
	JavaNote(){
		f=new JFrame("자바 메모장"); // 프레임 생성
		cut = new JMenuItem("잘라내기"); //잘라내기 메뉴 생성
		copy = new JMenuItem("복사"); // 복사 메뉴 
		paste =new JMenuItem("붙이기"); // 붙이기 메뉴 생성
		selectAll = new JMenuItem("모두선택") ; //선택 메뉴 생성
		new1 = new JMenuItem("새로운 파일 생성");
		
		
		cut.addActionListener(this) ; // 액션리스너 붙이기 
		copy.addActionListener(this);  
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		new1.addActionListener(this);
		
		mb = new JMenuBar(); //메뉴바 생성
		file = new JMenu("파일"); // 메뉴 생성
		edit = new JMenu("편집"); 
		
		edit.add(cut) ; edit.add(copy); edit.add(paste) ; edit.add(selectAll);
		file.add(new1);
		mb.add(file); mb.add(edit);  // 메뉴바 ,메뉴 ,항목 붙이기 
		
		ta = new JTextArea(); //텍스트 에어리어 생성
		ta.setBounds(5,5,360,320);  
		f.add(mb); f.add(ta);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {// 추상 메소드 재정의 
		if(e.getSource()==cut)  // 잘라내기 메뉴가 클릭된 경우 
			ta.cut();  		// 선택된 문자열의 내용을 잘라내기
 		if(e.getSource() == paste) // 붙이기 메뉴가 클릭된 경우
 			ta.paste(); 
 		
 		if(e.getSource() == copy)  //복사 메뉴가 클릭된 경우 
 			ta.copy(); //선택 문자열을 복사 
		
 		if(e.getSource() == selectAll)  // 모두선택 메뉴가 클릭된 경우
 			ta.selectAll();   	//모든 문자열 선택
		
	}
	
	
	public static void main(String[] args) {
		new JavaNote();
	}
}
