import java.util.Scanner;

public class TextBasedAdventure {
    public static boolean hasSword = false;
    static Scanner keyboardInput = new Scanner(System.in);

    public void execute() {
        System.out.println("Welcome to Escape from the Cave! Press enter when you are ready to start...");
        keyboardInput.nextLine();
        System.out.println("You are trapped in a cave!");
        start();
    }

    public static void start() {
        System.out.println("You find yourself in a large room. What would you like to do?\n1. Go left \n2. Go right");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            moveLeft.goLeft();
        }
        else if (input == 2) {
            moveRight.goRight();
        }
    }


    public static void main(String[] args) {
        new TextBasedAdventure().execute();
    }
}