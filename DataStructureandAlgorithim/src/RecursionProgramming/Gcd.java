package RecursionProgramming;

public class Gcd {

	public static void main(String[] args) {
		Gcd let = new Gcd();
		var results =let.Gcd(4,2);
		System.out.println(results);

	}
	
	public int Gcd(int a , int b) {
		if (a<0|| b<0) {
			return -1;
		}
		
		if(b==0) {
			return a;
		}
		return Gcd(b,a%b);
	}

}
