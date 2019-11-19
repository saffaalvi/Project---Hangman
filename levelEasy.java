import java.util.Random;
import java.util.*;

public class levelEasy extends Dictionary
{
	public levelEasy()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(easy.size());
	    System.out.println(easy.get(rnd));
    }
}
 
