import java.util.*;

public class levelEasy extends Dictionary
{
	public static String word, newWord;
	public static int countRight=0, countWrong=0;
	
	public levelEasy()
	{
		Random rand = new Random();
	    int rnd = rand.nextInt(easy.size());
	    word = easy.get(rnd);
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

/**import java.util.Random;
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
  

import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<String> medium = new ArrayList<String>();

        // 6 letters
        medium.add("agency");
        medium.add("airbag");
        medium.add("alarms");
        medium.add("cheque");
        medium.add("jacket");
        medium.add("honest");
        medium.add("impair");
        medium.add("junior");
        medium.add("levels");
        medium.add("moused");
        // 7 letters
        medium.add("attacks");
        medium.add("barrier");
        medium.add("battled");
        medium.add("choices");
        medium.add("harness");
        medium.add("laptops");
        medium.add("lighter");
        medium.add("tourism");
        medium.add("unwound");
        medium.add("voyager");
        // 8 letters
        medium.add("bulletin");
        medium.add("calendar");
        medium.add("collapse");
        medium.add("criminal");
        medium.add("teaching");
        medium.add("southern");
        medium.add("proposal");
        medium.add("momentum");
        medium.add("organize");
        medium.add("flexible");

        Scanner sc = new Scanner(System.in);

        // Randomize elements in the array
        for (int i = 0; i < medium.size(); i++) {

            int rand = new Random().nextInt(medium.size());
            String currentWord = medium.get(rand);

            // Check letters in word
            for(int n = 0; n < 30; n ++){

                System.out.println(currentWord); // to know which word is used

                emptyString(currentWord);

                System.out.println("Enter a letter");
                char guess = sc.next().charAt(0);

                if(currentWord.indexOf(guess) == -1)
                    System.out.println("Nope");
                else{
                    System.out.println("Yes!!");
                    getOccurringChar(currentWord, guess);
                }

            }
        }

    }

    static void emptyString(String word){

        for(int i = 0; i < word.length(); i ++)
            System.out.print("_ ");
        System.out.print("\n\n");

    }

    static void getOccurringChar(String str, char guess) {


        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == guess) {
                count++;
                printGuesses(str, guess, i);
            }
        }
        System.out.println("Repeats "+ count);

    }

    static void printGuesses(String word, char letter, int i){

        for(int j = 0; j < word.length(); j ++){
            if(j == i)
                System.out.print(letter + " ");
            else
                System.out.print(" _ ");
        }

        System.out.print("\n");
    }

}
**/
	
 
