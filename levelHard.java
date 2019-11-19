import java.util.Random;

public class levelHard extends Dictionary
{
	public levelHard()
	{
	    Random rand = new Random();
	    int rnd = rand.nextInt(hard.size());
	    String word = hard.get(rnd);
	    System.out.println(word);
	    for (int i=0; i<word.length(); i++)
	    	System.out.print("_ ");
	}
}
