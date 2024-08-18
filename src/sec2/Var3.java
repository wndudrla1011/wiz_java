package sec2;

public class Var3 {

	public static void main(String[] args) {
		int i = 10;
		double d = i; // 묵시적 형변환

		double d2 = 3.140;
		int i2 = (int) d2; // 명시적 형변환

		System.out.println(d2);
		System.out.println(i2);
	}

}
