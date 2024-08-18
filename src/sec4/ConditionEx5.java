package sec4;

import java.util.Scanner;

public class ConditionEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int i = sc.nextInt();
		int result = i % 2;

		switch (result) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("오류입니다.");
			break;
		}

	}

}
