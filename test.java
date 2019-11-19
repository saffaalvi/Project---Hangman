import java.util.*;

public class test{

	public static void main(String[] args) {
		
		Dictionary temp = new Dictionary();
		
		
		/**for (String str:temp.getEasy())
		{
			System.out.println(temp.getEasy().indexOf(str)+ " " + str.toString());
		}
	    for (String str:temp.getMed())
		{
			System.out.println(temp.getMed().indexOf(str)+ " " + str.toString());
		}
	    for (String str:temp.getHard())
		{
			System.out.println(temp.getHard().indexOf(str)+ " " + str.toString());
		}**/
		
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
