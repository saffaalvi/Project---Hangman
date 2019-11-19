import java.util.Random;
import java.util.*;

public class levelEasy extends Dictionary
{
	public levelEasy()
	{
	    String word = easy.get(rnd);
	    System.out.println(word);
	    for (int i=0; i<word.length(); i++)
	    System.out.print("_ ");
    	}
}
 
