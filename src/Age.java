import java.util.Scanner;


public class Age {

	public static void ask()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the half-life?");
		Double half_life = scan.nextDouble();
		
		
		System.out.println("How much mass of the original remains? Enter as the denominator in the euqation 1/x");
		Double remaining = scan.nextDouble();
		
		
		
		solve(half_life,remaining);
	}
	
	public static void solve(double half_life,double remaining)
	{
		double age = (Math.log(remaining))/Math.log(2) * half_life;
		
		System.out.println("The age is " + age);
		Question.finish();
	}
	
}
