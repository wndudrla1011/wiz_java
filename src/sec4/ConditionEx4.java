package sec4;

import java.util.Scanner;

public class ConditionEx4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3;

		if (kor > avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else if (kor < avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}

		if (eng > avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else if (eng < avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}

		if (math > avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else if (math < avg) {
			System.out.println("��պ��� ���� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}

	}

}
