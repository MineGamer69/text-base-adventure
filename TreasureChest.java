import java.util.Scanner;

public class TreasureChest 
{
    private static Scanner scan = new Scanner(System.in);

    public static void chestFound()
    {
        System.out.println("You found a treasure chest! What do you want to do?\n1. Open Chest\n2. Leave Chest");
        int input = scan.nextInt();

        if(input == 1)
        {
            System.out.println("You found a crown!");
            TextBasedAdventure.start();
        }
        else if(input == 2)
        {
            System.out.println("You walked away...");
            TextBasedAdventure.start();
        }
    }
}
