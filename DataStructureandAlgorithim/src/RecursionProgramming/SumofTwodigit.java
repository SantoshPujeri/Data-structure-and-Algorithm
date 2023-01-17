package RecursionProgramming;

public class SumofTwodigit {

	public static void main(String[] args) {
		SumofTwodigit ret = new SumofTwodigit();
		var recutu = ret.SumofTwodigit(10);
		System.out.println(recutu);

	}
	
	
	
	public int SumofTwodigit(int n) {
		if(n==0) {
			return 0;
		}
		
		return n%10+SumofTwodigit(n/10);
		
	}

}
