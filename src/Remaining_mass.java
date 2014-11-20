import java.util.Scanner;


public class Remaining_mass {

	public static void ask()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the half-life?");
		Double half_life = scan.nextDouble();
		
		System.out.println("How much time has passed (in same units as half life)?");
		Double age = scan.nextDouble();
		
		System.out.println("What was the original mass");
		Double og_mass = scan.nextDouble();
		
		
		
		solve(half_life,og_mass,age);
	}
	
	public static void solve(double half_life,double og_mass,double age)
	{
		double remaining_mass = og_mass * Math.pow(.5,(age/half_life));
		
		System.out.println("The age is " + remaining_mass);
		Question.finish();
	}
	
}
