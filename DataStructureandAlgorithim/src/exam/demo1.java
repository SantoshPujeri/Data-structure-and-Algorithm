package exam;

public class demo1 {

	public static void main(String[] args) {
		
		
		demo1 let = new demo1();
		var results=let.factorial(4);
		System.out.println(results);
		
	
		
	}
	
	
	public int factorial(int n) {
		
		if (n==0 ||n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}

}
