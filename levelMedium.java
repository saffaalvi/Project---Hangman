import java.util.*;

public class levelMedium extends Dictionary
{
	public static String word, newWord;
	public static int countRight=0, countWrong=0;
	public static char[] wrongLetters = new char[6];
	public static int c=0;
	public levelMedium()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(medium.size());
	    word = medium.get(rnd);
	    //System.out.println(word);
	    char[] underscore = new char[word.length()];
	    for (int i=0; i<word.length(); i++)
	    {
	    	underscore[i] = '-';
	    	System.out.print(underscore[i]);
	    }
	    while(true)
	    {
            System.out.print("\nEnter a letter: ");
            Scanner sc = new Scanner(System.in);
            char guess = sc.next().charAt(0);	
            check(guess, underscore);
            if (countWrong!=6)
                System.out.println(underscore);
            if (countWrong==6)
            {
            	System.out.println("SORRY! YOU LOSE! THE WORD WAS " + word);
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
	    	printHangman(countWrong);
	    	wrongLetters[c]=guess;
	        c++;
	    }
		System.out.print("WRONG LETTERS: "); 
	    for(int i=0; i<6; i++)
    		System.out.print(wrongLetters[i] + " ");
		System.out.print("\n"); 
	}
}
