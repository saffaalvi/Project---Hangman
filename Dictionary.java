import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
	
     ArrayList<String> easy = new ArrayList<String>();
     ArrayList<String> medium = new ArrayList<String>();
     ArrayList<String> hard = new ArrayList<String>();
     public Dictionary() {
    //easy
    String[] list = {"app", "fat", "sun", "cub", "cat", "mat", "hat", "fun", "run", "map", "mill", "kill", "fill", "will",
                "each", "most", "inch", "horn", "join", "duck", "basil", "chick", "magic", "annoy", "cards", "nasty",
                "visit", "upset", "laugh", "prize"};
        easy.addAll(Arrays.asList(list));

    // Medium ArrayList
   String[] list ={"agency","airbag","alarms","cheque","jacket","honest","impair","junior","levels","moused",
                "attacks", "barrier", "battled", "choices", "harness", "laptops", "lighter", "tourism","unwound",
                "voyager","bulletin","calendar","collapse","criminal","teaching","southern","proposal","momentum",
                "organize","flexible"};
        medium.addAll(Arrays.asList(list));
    
    //hard
    //index 0 to 39
    String list9[] = {"alchemist", "amplitude", "authorize", "awestruck", "binocular", "gymnastic", "hydration", "numerical", "nightmare", "supremacy"};
    hard.addAll(Arrays.asList(list9));
    String list10[] = {"academical", "biographer", "bibliology", "cassiopeia", "cryptogram", "elliptical", "hemisphere", "heliograph", "phenomenal", "philosophy"};
    hard.addAll(Arrays.asList(list10));
    String list11[] = {"accommodate", "affirmative", "blasphemous", "calligraphy", "designation", "evaporation", "exclamation", "holographic", "observatory", "seismograph"}; 
    hard.addAll(Arrays.asList(list11));
    String list12[] = {"alphabetical", "amphitheater", "catastrophic", "chromosphere", "evolutionist", "hieroglyphic", "hippopotamus", "intellectual", "photographer", "sophisticate"}; 
    hard.addAll(Arrays.asList(list12));
	} 
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
    
    
}
