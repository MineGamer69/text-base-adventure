import java.util.Scanner;
public class moveDown 
{
    public static void goDown()
    {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("You have entered a room with three buttons. Which button do you press?");
        int input = keyboardInput.nextInt();
        if(input == 3)
        {
            System.out.println("A panel opens below you and you end up in another room");
            moveLeft.goLeft();
        }
        else if(input == 1)
        {
            System.out.println("A panel opens below you and you end up in another room");
            TextBasedAdventure.start();
        }
        else if (input == 2)
        {
            System.out.println("A panel opens below you and you end up in another room");
            moveRight.goRight();
        }

    }
}
