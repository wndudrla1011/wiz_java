package sec3;

import java.util.Scanner;

public class CalculationEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int i = scanner.nextInt();
		
		if (i % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
	
}
