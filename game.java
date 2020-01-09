import java.util.*;
//This class contains the game itself. Chooses a random word from the list according to the level chosen.
//Prompts the user for guess, displays whether correct or incorrect guess and hangman picture if wrong guess.
//Ends the game if 6 wrong guesses are entered or lets the user know they won if the word is correctly guessed
public class game extends Dictionary
{
    public static String word;      //word randomly chosen from appropriate list
    public static int countRight=0, countWrong=0;   //keeps count of number of right and wrong guesses
    public static char[] wrongLetters = new char[6];    //array of wrong letters
    public static int c=0;  //used for index count

    public game(int a)
    {
        Random rand = new Random();
        if (a==1)   //easy
        {
            int rnd = rand.nextInt(easy.size());
            word = easy.get(rnd);
        }
        if (a==2)   //medium
        {
            int rnd = rand.nextInt(medium.size());
            word = medium.get(rnd);
        }
        else        //hard
        {
            int rnd = rand.nextInt(hard.size());
            word = hard.get(rnd);
        }
        //System.out.println(word); //can print word (used for testing)
        char[] underscore = new char[word.length()];    //array of underscores, length of word chosen
        //populate array with underscores and print
        for (int i=0; i<word.length(); i++)
        {
            underscore[i] = '-';
            System.out.print(underscore[i]);
        }
        //prompts user to enter letter, checks if right or wrong, displays hangman picture if wrong and adds to count.
        //adds to correct letters if right. array of underscores/right guesses and wrong guesses are printed everytime to help user keep track of word.
        while(true)
        {
            System.out.print("\nEnter a letter: ");
            Scanner sc = new Scanner(System.in);
            char guess = sc.next().charAt(0);
            check(guess, underscore);
            if (countWrong!=6)
                System.out.println(underscore);
            if (countWrong==6)  //max number of wrong letters is 6. if 6 wrong guesses are entered, game is ended
            {
                System.out.println("SORRY! YOU LOSE! THE WORD WAS " + word);
                break;
            }
            if (countRight==word.length())  //user guessed the word, game ends
            {
                System.out.println("YOU WIN");
                break;
            }
        }

    }
    //checks if guess entered by user is correct or incorrect and displays response accordingly
    public static void check (char guess, char[] underscore)
    {
        int ch = 0; //used to display "correct"

        for(int i=0; i<word.length(); i++)  //goes through each character of the word to check if guess matches any of the letters
        {
            if (word.charAt(i) == guess)    //correct guess (match found)
            {
                underscore[i]=guess;    //adds letter to underscore list at the correct position
                ch = 1;
                countRight++;
            }
        }
        if (ch==1)
        {
            System.out.println("correct!");
        }
        else        //incorrect guess, increments countWrong and prints hangman.
        {
            System.out.println("wrong!");
            countWrong++;
            printHangman(countWrong);
            wrongLetters[c++]=guess;
        }
        //prints all the wrong letters entered for user to keep track
        System.out.print("WRONG LETTERS: ");
        for(int i=0; i<6; i++)
            System.out.print(wrongLetters[i] + " ");
        System.out.print("\n");
    }
}
