package sec4;

public class ConditionEx3 {

	public static void main(String[] args) {

		int seoulLunchPrice = 5000;

		if (seoulLunchPrice >= 9000) {
			System.out.println("서울 물가 왕 비싸네요");
		} else if (seoulLunchPrice >= 7000) {
			System.out.println("서울 물가 조금 비사네요");
		} else if (seoulLunchPrice >= 5000) {
			System.out.println("서울 물가 적당하네요");
		} else {
			System.out.println("서울 물가 저렴하네요");
		}

	}

}
