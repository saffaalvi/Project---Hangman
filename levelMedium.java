import java.util.*;

public class levelMedium extends Dictionary
{
	public static String word, newWord;
	public static int count=0;
	
	public levelMedium()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(medium.size());
	    word = medium.get(rnd);
	    System.out.println(word);
	    char[] underscore = new char[word.length()];
	    for (int i=0; i<word.length(); i++)
	    {
	    	underscore[i] = '-';
	    }
	    for(int i=0; i<word.length(); i++)
	    {
            System.out.print("Enter a letter: ");
            Scanner sc = new Scanner(System.in);
            char guess = sc.next().charAt(0);	
            check(guess, underscore);
            System.out.println(underscore);
            if (count==word.length())
            {
            	System.out.println("YOU WIN");
            	break;
            }
            	
        }
	    
	}
	public static void check (char guess, char[] underscore)
	{
		int ch = 0;
	    for(int i=0; i<word.length(); i++)
	    {
	    	if (word.charAt(i) == guess)
	    	{
	    		underscore[i]=guess;
	    		ch = 1;
	    		count++;
	    	}		
	    }
	    if (ch==1)
	    {
	    	System.out.println("correct!");
	    }
	    else
	    	System.out.println("wrong!");
	    System.out.println(count);
	}
}
