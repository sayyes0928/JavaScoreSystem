import java.lang.reflect.Array;
import java.util.Scanner;

public class StudentData {
	Scanner sc = new Scanner(System.in);
    String name;
	String num;
	int java, html, jsp, spring, total, avg; //
	
	public StudentData(){ //������ 
		
	}
	public void insert(){ // �Է� �޼ҵ�
		
		}
	public int total(){
		return total = java + html + jsp + spring;
	}
	public int avg () {
		return avg = total/4;
	}
	public void showData() {
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + num);
		System.out.println("java : " + java);
		System.out.println("html : " + html);
		System.out.println("jsp : " + jsp);
		System.out.println("spring : " + spring);
		if (total == 0) {
			System.out.println("������ ������ �ʾҽ��ϴ�.");
		}else {
		System.out.println("total : " + total);
		System.out.println("avg : " + avg+"\n");
		}
	}
	}
