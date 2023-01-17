package RecursionProgramming;

public class Problem1 {

	public static void main(String[] args) {

		Problem1 recursion = new Problem1();
		var rec = recursion.factorial(3);
		System.out.println(rec);

	}

	public  int factorial(int n) {

		if (n==0||n==1){
			
		
		return 1;
	}

	return n * factorial(n-1);
	}
}
