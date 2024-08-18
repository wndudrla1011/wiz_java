package sec4;

public class ConditionEx2 {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int h = 30;
		int k = 10;

		if (i > j) {
			System.out.println("i는 j보다 " + (i - j) + "만큼 더 큽니다.");
		} else {
			System.out.println("j는 i보다 " + (j - i) + "만큼 더 큽니다.");
		}

		if ((i + j) == h) {
			System.out.println("i + j = h");
		} else {
			System.out.println("i + j != h");
		}

	}

}
