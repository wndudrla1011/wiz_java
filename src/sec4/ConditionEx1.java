package sec4;

public class ConditionEx1 {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int h = 10;

		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (i == j) {
			System.out.println("i와 j는 같습니다.");
		} else {
			System.out.println("i가 j보다 작습니다.");
		}

		if (i == h)
			System.out.println("i와 h는 같습니다.");

	}

}
