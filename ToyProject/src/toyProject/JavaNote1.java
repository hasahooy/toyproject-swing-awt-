package toyProject;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


//메모장을 만들어보자 ! 
public class JavaNote1 implements ActionListener{
	JFrame f; // 프레임 변수
	JMenuBar mb; //메뉴바 변수 
	JMenu file,edit; //메뉴 변수 
	JMenuItem cut,copy,paste,selectAll,new1; // 메뉴항목 변수 
	JTextArea ta;  // 텍스트 에어리어 변수 
	JMenuItem i_save , i_load; // 파일메뉴 항목 변수 추가 
	
	JavaNote1(){
		f=new JFrame("자바 메모장"); // 프레임 생성
		cut = new JMenuItem("잘라내기"); //잘라내기 메뉴 생성
		copy = new JMenuItem("복사"); // 복사 메뉴 
		paste =new JMenuItem("붙이기"); // 붙이기 메뉴 생성
		selectAll = new JMenuItem("모두선택") ; //선택 메뉴 생성
		new1 = new JMenuItem("새로운 파일 생성");
		i_save = new JMenuItem("저장");
		i_load = new JMenuItem("열기"); 
		
		
		cut.addActionListener(this) ; // 액션리스너 붙이기 
		copy.addActionListener(this);  
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		new1.addActionListener(this);
		i_save.addActionListener(this);
		i_load.addActionListener(this);
		
		
		mb = new JMenuBar(); //메뉴바 생성
		file = new JMenu("파일"); // 메뉴 생성
		edit = new JMenu("편집"); 
		
		edit.add(cut) ; edit.add(copy); edit.add(paste) ; edit.add(selectAll);
		file.add(new1); file.add(i_load); file.add(i_save);  
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
 		
 		if(e.getSource() == i_save) { //저장 항목 구현
 			
 			FileDialog fd= new FileDialog(f,"저장",FileDialog.SAVE);
 			fd.setVisible(true);
 			
 			String path = fd.getDirectory() + fd.getFile(); 
 			
 			if(fd.getFile() == null) 
 				return ; 
 			
 			try { 
 				
 			FileWriter fw =new FileWriter(path) ; 
 			String s = ta. getText(); 
 			fw.write(s);
 			fw.close();
 			}catch(Exception e1) {
 				System.out.println("저장오류" + e1);
 			}
 		}
 		if(e.getSource() == i_load) {  // 열기 항목구현 
 			FileDialog fd = new FileDialog(f,"열기",FileDialog.LOAD);
 				fd.setVisible(true);
 				
 				String path = fd.getDirectory() + fd.getFile() ; 
 				
 				String s= ""; 
 				
 				if(fd.getFile() == null) return ; 
 				
 				try { 
 					
 					FileReader fr= new FileReader(path); 
 					
 					int k ;  //읽은 문자의 코드를 저장하기 위한 변수 
 					 
 					while(true)  { //남은 문자가 있는한 무한 반복
 						k = fr.read();  //read()를 사용해서 읽은 문자코드를 k에 입력
 						if(k== -1) break ;  //-1은 파일 끝을 나타내는 코드,읽기 종료 
 						s+= (char) k ;   //k를 문자로 바꾸어서 문자열에 저장 
 					}
 					
 					fr.close();
 				}catch(Exception e2) {
 					
 					System.out.println("오류 "+e2);
 				}
 				ta.setText(s);
 		}
 		
	}
	
	
	public static void main(String[] args) {
		new JavaNote1();
	}
}
