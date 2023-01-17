package RecursionProgramming;

public class Decima2Binary {

	public static void main(String[] args) {
		
		Decima2Binary let = new Decima2Binary();
		var results = let.Decima2Binary(10);
		System.out.println(results);
	
		
		
	}
	
	
	
	public int Decima2Binary(int n)
	{
		
		if (n==0) {
			return 0;
		}
		return n%2+10*Decima2Binary(n/2);
	}
}
