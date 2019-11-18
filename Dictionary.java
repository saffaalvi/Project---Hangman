//Dictionary.java

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
	public static void main(String[] args) {

    ArrayList<String> easy = new ArrayList<String>();
    ArrayList<String> medium = new ArrayList<String>();
    ArrayList<String> hard = new ArrayList<String>();

    //easy
        easy.add("app");
        easy.add("fat");
        easy.add("sun");
        easy.add("cub");
        easy.add("cat");
        easy.add("mat");
        easy.add("hat");
        easy.add("fun");
        easy.add("run");
        easy.add("map");
        easy.add("mill");
        easy.add("kill");
        easy.add("fill");
        easy.add("will");
        easy.add("each");
        easy.add("most");
        easy.add("inch");
        easy.add("horn");
        easy.add("join");
        easy.add("duck");
        easy.add("basil");
        easy.add("chick");
        easy.add("magic");
        easy.add("annoy");
        easy.add("cards");
        easy.add("nasty");
        easy.add("visit");
        easy.add("upset");
        easy.add("laugh");
        easy.add("prize");

    // Medium ArrayList
    // 6 words
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
    // 7 words
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
    // 8 words
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
    
    //hard
    String list9[] = {"alchemist", "amplitude", "authorize", "awestruck", "binocular", "gymnastic", "hydration", "numerical", "nightmare", "supremacy"};
    hard.addAll(Arrays.asList(list9));
    String list10[] = {"academical", "biographer", "bibliology", "cassiopeia", "cryptogram", "elliptical", "hemisphere", "heliograph", "phenomenal", "philosophy"};
    hard.addAll(Arrays.asList(list10));
	for (String str:medium)
	{
		System.out.println(str.toString());
	}
}
}
