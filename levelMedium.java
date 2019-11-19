import java.util.*;

public class levelMedium extends Dictionary
{
	public levelMedium()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(medium.size());
	    System.out.println(medium.get(rnd));
	}
    
}
