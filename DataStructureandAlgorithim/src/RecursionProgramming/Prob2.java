package RecursionProgramming;

public class Prob2 {

	public static void main(String[] args) {
		
		Prob2 recurion = new Prob2();
		var rec = recurion.factorial(3);
		
		System.out.println(rec);
		

	}

	public int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
}
