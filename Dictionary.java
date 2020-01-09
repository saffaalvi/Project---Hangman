import java.util.ArrayList;
import java.util.Arrays;
//This class contains all the words for the 3 levels 
public class Dictionary {
	
     ArrayList<String> easy = new ArrayList<String>();
     ArrayList<String> medium = new ArrayList<String>();
     ArrayList<String> hard = new ArrayList<String>();
	
     public Dictionary() 
     {
    //Easy ArrayList
    	String[] list = {"app", "fat", "sun", "cub", "cat", "mat", "hat", "fun", "run", "map", "mill", "kill", "fill", "will",
                "each", "most", "inch", "horn", "join", "duck", "basil", "chick", "magic", "annoy", "cards", "nasty",
                "visit", "upset", "laugh", "prize"};
        easy.addAll(Arrays.asList(list));

    //Medium ArrayList
   	String[] list1 ={"agency","airbag","alarms","cheque","jacket","honest","impair","junior","levels","moused",
                "attacks", "barrier", "battled", "choices", "harness", "laptops", "lighter", "tourism","unwound",
                "voyager","bulletin","calendar","collapse","criminal","teaching","southern","proposal","momentum",
                "organize","flexible"};
        medium.addAll(Arrays.asList(list1));
    
    //Hard ArrayList
    	String list2[] = {"alchemist", "amplitude", "authorize", "awestruck", "binocular", "gymnastic", "hydration", 
    		"numerical", "nightmare", "supremacy", "academical", "biographer", "bibliology", "cassiopeia", "cryptogram", 
    		"elliptical", "hemisphere", "heliograph", "phenomenal", "philosophy", "accommodate", "affirmative", "blasphemous", 
    		"calligraphy", "designation", "evaporation", "exclamation", "holographic", "observatory", "seismograph", 
    		"alphabetical", "amphitheater", "catastrophic", "chromosphere", "evolutionist", "hieroglyphic", "hippopotamus", 
    		"intellectual", "photographer", "sophisticate"}; 
    	hard.addAll(Arrays.asList(list2));
    } 
	
    //get methods for lists
    public ArrayList<String> getEasy()
    {
    	return easy;
    }
    public ArrayList<String> getMed()
    {
    	return medium;
    }
    public ArrayList<String> getHard()
    {
    	return hard;
    }
   //method to print out hangman picture according to number of wrong guesses
	public static void printHangman(int wrong_guesses){
		if(wrong_guesses>=0){
		    System.out.println("\t   --------");
		    System.out.print("\t  |\n\t  |\n\t  |\n");
		}
		if(wrong_guesses>=1){
		    System.out.print("\t ---\n\t|   |\n\t ---\n");
		}
		if(wrong_guesses==2){
		     System.out.print("\t  |\n\t  |\n\t  |\n\t  |\n\t  |\n");
		}
		else if(wrong_guesses==3){
		    System.out.print("\t  |\t/\n\t  |   /\n\t  | /\n\t  |\n\t  |\n");
		}
		 else if(wrong_guesses>=4){
		    System.out.print("      \\   |   /\n       \\  |  /\n\t\\ | /\n\t  |\n\t  |\n");
		}
		if(wrong_guesses==5){
		    System.out.println("\t    \\\n\t     \\\n\t      \\");
		}
		else if(wrong_guesses==6){
		    System.out.println("\t/   \\\n       /     \\\n      /       \\");
		}
	}
}

