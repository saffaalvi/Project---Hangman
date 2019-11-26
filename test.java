import java.util.*;

public class test{

	public static void main(String[] args) {
		
		Dictionary temp = new Dictionary();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter level (1 for easy, 2 for medium, 3 for hard): ");
		int level = sc.nextInt();
		if (level == 1)
		{
			levelEasy game = new levelEasy();
		}
		if (level == 2)
		{
			levelMedium game = new levelMedium();
		}
		if (level == 3)
		{
			levelHard game = new levelHard();
		}
			
			
			
	}


}
