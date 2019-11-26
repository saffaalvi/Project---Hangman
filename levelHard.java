import java.util.*;

public class levelHard extends Dictionary
{
	public static String word, newWord;
	public static int countRight=0, countWrong=0;
	
	public levelHard()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(hard.size());
	    word = hard.get(rnd);
	    System.out.println(word);
	    char[] underscore = new char[word.length()];
	    for (int i=0; i<word.length(); i++)
	    {
	    	underscore[i] = '-';
	    }
	    while(true)
	    {
            System.out.print("Enter a letter: ");
            Scanner sc = new Scanner(System.in);
            char guess = sc.next().charAt(0);	
            check(guess, underscore);
            System.out.println(underscore);
            if (countWrong==5)
            {
            	System.out.println("SORRY! YOU LOSE");
            	break;
            }
            if (countRight==word.length())
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
	    		countRight++;
	    	}		
	    }
	    if (ch==1)
	    {
	    	System.out.println("correct!");
	    }
	    else
	    {
	    	System.out.println("wrong!");
	    	countWrong++;
	    	System.out.println("WRONG LETTERS: " + countWrong);
	    	printHangman(countWrong);
	    }
	}
}
