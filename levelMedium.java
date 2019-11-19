import java.util.*;

public class levelMedium extends Dictionary
{
	public levelMedium()
	{
	    Random rand = new Random();
	    int rnd = rand.nextInt(medium.size());
	    String word = medium.get(rnd);
	    System.out.println(word);
	    for (int i=0; i<word.length(); i++)
	    	System.out.print("_ ");
	}
    
}
