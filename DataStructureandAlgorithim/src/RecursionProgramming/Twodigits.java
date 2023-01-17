package RecursionProgramming;

public class Twodigits {

	public static void main(String[] args) {

		Twodigits let = new Twodigits();
		var results = let.Twodigits(10);
		System.out.println(results);

	}

	public int Twodigits(int n) {

		if (n == 0) {
			return 0;
		}

		return n % 10 + Twodigits(n / 10);

	}

}
