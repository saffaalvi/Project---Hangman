import java.util.Random;
import java.util.*;

public class levelEasy extends Dictionary
{
	public levelEasy()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(easy.size());
	    String word = easy.get(rnd);
	    System.out.println(word);
	    for (int i=0; i<word.length(); i++)
	    	System.out.print("_ ");
	    int count=0;
	    while(true)
	    {
            String guess;
            System.out.print("Enter a letter: ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextLine();
            if(word.indexOf(guess) == -1)
                System.out.println("Nope\n");
            else
            {
                System.out.println("Yes!!");
                count++;
            }
            if (count==word.length())
            		break;
        }
    }
   }
	
 
