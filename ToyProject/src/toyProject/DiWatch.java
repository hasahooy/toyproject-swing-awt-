package toyProject;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel; 

public class DiWatch implements Runnable {  //쓰레드를 위해 Runnable  구현
	JFrame f; 
	Thread t =null;					 // 쓰레드 변수 선언
	int hours = 0 , minutes = 0 ,seconds= 0 ;  //시간 변수 선언
	static String timeString = "";  	// 시간 문자열 선언 
	static JLabel jl;					//시간을 표시할 라벨 

	DiWatch(){
		f = new JFrame();
			
		t = new Thread(this);  			//쓰레드 생성
			t.start(); 				 // 쓰레드 시작 
			
		jl = new JLabel(); 
			jl.setBounds(40,30,100,50);
				
		f.add(jl);
		f.setSize(200,150);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void  run() {    //run() 함수 재정의 
		try{
			while(true) {
				
				Calendar cal = Calendar.getInstance(); //캘린더 객체 생성 
				hours = cal.get(Calendar.HOUR_OF_DAY); // 날짜 가져오기 
				if(hours >12) hours -=12;			//12시간 설정
				minutes = cal.get(Calendar.MINUTE); //  분 가져오기 
				seconds = cal.get(Calendar.SECOND) ; // 초 가져오기 
				
				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss"); // 시간 포맷 
				Date date = cal.getTime();	//Date 객체 생성
				timeString = formatter.format(date);  // 시간 포맷 사용 
			
				printTime(); // 사용자 정의함수 
				
				t.sleep(1000);  //1초마다 반복 실행 
			}
		}
		catch(Exception e) {}
	}
	public static void printTime() {
		jl.setText("<html><body text = 'blue'><h1>"+ timeString + "</h1></html>" );
		//라벨의 텍스트에 <html> 태그를 사용하여 시간 문자열을 출력 
	}

public static void main(String[] args) {
	new DiWatch();
}
	}
