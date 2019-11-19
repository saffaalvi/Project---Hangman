import java.util.Random;

public class levelHard extends Dictionary
{
	public levelHard()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(hard.size());
	    System.out.println(hard.get(rnd));
	}
}
