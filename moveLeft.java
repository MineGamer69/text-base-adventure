import java.util.Scanner;
public class moveLeft {
    static Scanner keyboardInput = new Scanner(System.in);

    public static void goLeft() {
        System.out.println("Oh no! You run into a giant! Fight or flight?\n1. Fight \n2. Flight");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            playerfight.fight();
        }
        else if (input == 2) {
            TextBasedAdventure.start();
        }  
    }
    
}
