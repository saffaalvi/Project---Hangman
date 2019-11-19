import java.util.*;

public class levelMedium extends Dictionary
{
	public levelMedium()
	{
		for (int i = 0; i < medium.size(); i++) 
	    {
	        int rnd = new Random().nextInt(medium.size());
	        System.out.println(medium.get(rnd));
	    }
	}
    
}
