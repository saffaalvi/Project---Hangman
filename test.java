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
		System.out.println("Enter level (easy, medium, hard): ");
		Scanner sc = new Scanner(System.in);
		String level = sc.next();
		if (level == "easy")
		{
			levelEasy game = new levelEasy();
		}
		if (level == "medium")
		{
			levelMedium game = new levelMedium();
		}
		if (level == "hard")
		{
			levelHard game = new levelHard();
		}
			
			
			
	}


}
