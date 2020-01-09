import java.util.*;
//this class starts the game, asks user for which level they would like to play
public class test
{
    //main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter level (1 for easy, 2 for medium, 3 for hard): ");
        int level = sc.nextInt();
        if (level == 1)
        {
            game run = new game(1);
        }
        if (level == 2)
        {
            game run = new game(2);
        }
        if (level == 3) {
            game run = new game(3);
        }
    }
}
