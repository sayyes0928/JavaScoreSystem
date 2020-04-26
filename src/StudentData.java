import java.lang.reflect.Array;
import java.util.Scanner;

public class StudentData {
	Scanner sc = new Scanner(System.in);
    String name;
	String num;
	int java, html, jsp, spring, total, avg; //
	
	public StudentData(){ //생성자 
		
	}
	public void insert(){ // 입력 메소드
		
		}
	public int total(){
		return total = java + html + jsp + spring;
	}
	public int avg () {
		return avg = total/4;
	}
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + num);
		System.out.println("java : " + java);
		System.out.println("html : " + html);
		System.out.println("jsp : " + jsp);
		System.out.println("spring : " + spring);
		if (total == 0) {
			System.out.println("점수가 계산되지 않았습니다.");
		}else {
		System.out.println("total : " + total);
		System.out.println("avg : " + avg+"\n");
		}
	}
	}
