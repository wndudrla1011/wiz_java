package sec4;

import java.util.Scanner;

public class ConditionEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int i = sc.nextInt();
		int result = i % 2;

		switch (result) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
			break;
		}

	}

}
