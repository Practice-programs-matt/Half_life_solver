import java.util.Scanner;


public class Half_life {

	
	
	public static void solve(Double og_mass, Double time, Double current_mass)
	{
		double half_life = (time*Math.log(2) / (Math.log(og_mass/current_mass)));
		
		System.out.println("The half life is " + half_life);
	}
	
	public static void ask()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What was the original mass?");
		Double og_mass = scan.nextDouble();
		
		System.out.println("How much time has passed?");
		Double time = scan.nextDouble();
		
		System.out.println("What is the current mass?");
		Double current_mass = scan.nextDouble();
		
		solve(og_mass,time,current_mass);
	}
	
	
}
