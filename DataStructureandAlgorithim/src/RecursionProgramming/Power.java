package RecursionProgramming;

public class Power {

	public static void main(String[] args) {
		
		Power let = new Power();
		var results = let.Power(2,2);
		System.out.println(results);
		
	}
	
	
	public int Power(int base,int exp) {
		if (exp==0) {
			return 1;
		}
		
		
		
		return base*Power(base,exp-1);
	}

}
