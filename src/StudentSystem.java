import java.util.Scanner;

public class StudentSystem {

	static int k = 0;
	static int select;
	static String input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력
		StudentData stuData[] = new StudentData[3];

		while (true) { // 종료 전까지 반복(시작문)

			// ****초기 화면 출력 ****

			System.out.println("성적처리 입력 프로그램입니다");
			System.out.println("원하시는 번호를 입력하세요");
			System.out.println("1.입력"); // HachMap
			System.out.println("2.계산");
			System.out.println("3.출력");
			System.out.println("4.종료");

			input = sc.next(); // 사용자의 입력값 변수

			if (input.equals("1")) {

				stuData[k] = new StudentData();

				System.out.println("이름 : ");
				stuData[k].name = sc.next();
				System.out.println("학번 : ");
				stuData[k].num = sc.next();
				System.out.println("java :");
				stuData[k].java = sc.nextInt();
				System.out.println("html : ");
				stuData[k].html = sc.nextInt();
				System.out.println("jsp : ");
				stuData[k].jsp = sc.nextInt();
				System.out.println("spring : ");
				stuData[k].spring = sc.nextInt();

				System.out.println((k+1) +"번째"+ stuData[k].name + "학생의 정보가 입력되었습니다.\n");
				k++;

			} else if (input.equals("2")) {
				System.out.println("계산을 원하는 학생 번호를 입력해주세요.");
				select = sc.nextInt();
				
				stuData[select-1].total();
				stuData[select-1].avg();
				System.out.println("점수의 총 합과 평균이 계산되었습니다.");
				System.out.println("출력을 눌러 결과를 확인하세요.\n");

			} else if (input.equals("3")) {
				for (int i = 0; i < stuData.length; i++) {
					if (stuData[i] == null) {
						break;
					}
					stuData[i].showData();
					System.out.println("=============");
				}
				

			} else if (input.equals("4")) {
				break;
			}

		} // while 문 괄호
	}
}
