/**
public class levelEasy extends Dictionary{

}
**/

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

        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < medium.size(); i++) {

            int rnd = new Random().nextInt(medium.size());
            System.out.println(medium.get(rnd));

        }

       
    }

}





