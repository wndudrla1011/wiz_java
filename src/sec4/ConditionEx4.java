package sec4;

import java.util.Scanner;

public class ConditionEx4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3;

		if (kor > avg) {
			System.out.println("평균보다 높은 국어 점수");
		} else if (kor < avg) {
			System.out.println("평균보다 낮은 국어 점수");
		} else {
			System.out.println("평균 국어 점수");
		}

		if (eng > avg) {
			System.out.println("평균보다 높은 영어 점수");
		} else if (eng < avg) {
			System.out.println("평균보다 낮은 영어 점수");
		} else {
			System.out.println("평균 영어 점수");
		}

		if (math > avg) {
			System.out.println("평균보다 높은 수학 점수");
		} else if (math < avg) {
			System.out.println("평균보다 낮은 수학 점수");
		} else {
			System.out.println("평균 수학 점수");
		}

	}

}
