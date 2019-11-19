/*
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
*/

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

                String guess;
                System.out.println("Enter a letter");
                guess = sc.nextLine();

                if(currentWord.indexOf(guess) == -1)
                    System.out.println("Nope\n");
                else{
                    System.out.println("Yes!!");
                    // getOccuringChar(currentWord, guess);
                }

            }
        }

    }

    static void getOccuringChar(String str, String guess) {
    }

}



 
