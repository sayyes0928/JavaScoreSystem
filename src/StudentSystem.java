import java.util.Scanner;

public class StudentSystem {

	static int k = 0;
	static int select;
	static String input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է�
		StudentData stuData[] = new StudentData[3];

		while (true) { // ���� ������ �ݺ�(���۹�)

			// ****�ʱ� ȭ�� ��� ****

			System.out.println("����ó�� �Է� ���α׷��Դϴ�");
			System.out.println("���Ͻô� ��ȣ�� �Է��ϼ���");
			System.out.println("1.�Է�"); // HachMap
			System.out.println("2.���");
			System.out.println("3.���");
			System.out.println("4.����");

			input = sc.next(); // ������� �Է°� ����

			if (input.equals("1")) {

				stuData[k] = new StudentData();

				System.out.println("�̸� : ");
				stuData[k].name = sc.next();
				System.out.println("�й� : ");
				stuData[k].num = sc.next();
				System.out.println("java :");
				stuData[k].java = sc.nextInt();
				System.out.println("html : ");
				stuData[k].html = sc.nextInt();
				System.out.println("jsp : ");
				stuData[k].jsp = sc.nextInt();
				System.out.println("spring : ");
				stuData[k].spring = sc.nextInt();

				System.out.println((k+1) +"��°"+ stuData[k].name + "�л��� ������ �ԷµǾ����ϴ�.\n");
				k++;

			} else if (input.equals("2")) {
				System.out.println("����� ���ϴ� �л� ��ȣ�� �Է����ּ���.");
				select = sc.nextInt();
				
				stuData[select-1].total();
				stuData[select-1].avg();
				System.out.println("������ �� �հ� ����� ���Ǿ����ϴ�.");
				System.out.println("����� ���� ����� Ȯ���ϼ���.\n");

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

		} // while �� ��ȣ
	}
}
