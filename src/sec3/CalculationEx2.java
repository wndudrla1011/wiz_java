package sec3;

import java.util.Scanner;

public class CalculationEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int i = scanner.nextInt();
		
		if (i % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
	}
	
}
