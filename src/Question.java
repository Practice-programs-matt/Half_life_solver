import java.util.Scanner;


public class Question {

	public static void ask()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of information you are trying to determine. Key:\nhl = Half Life\nage = age\nrm = remaining mass");
		String input = scan.nextLine();		
		
		if (input.equalsIgnoreCase("hl"))   // solves for half life
		{
			Half_life.ask();
		}
		
		if (input.equalsIgnoreCase("mass"))
		{
			Age.ask();
		}
		/////////working on
		if (input.equalsIgnoreCase("rm"))
		{
			Remaining_mass.ask();
		}
		
		///////////not done
		if (input.equalsIgnoreCase("mass"))
		{
			Mass.ask();
		}
		
		if (input.equalsIgnoreCase("time")) // time until a certian mass remains
		{
			//Time.ask();
		}
		if (input.equalsIgnoreCase("age")) // time until a certian mass remains
		{
			Age.ask();
		}
		
	}
	
	public static void finish()
	{
		System.out.println("Do you want to enter another problem. [Y/N] ?>>>>>>>>>>>>");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();	
		
		if (input.equalsIgnoreCase("y"))
		{
			Question.ask();
		}
		else 
		{
			System.out.println("Good Bye");
		}
		
		
	}
	
}
