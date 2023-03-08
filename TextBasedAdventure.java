import java.util.Scanner;

public class TextBasedAdventure {
    public static boolean hasSword = false;
    static Scanner keyboardInput = new Scanner(System.in);

    public void execute() {
        System.out.println("Welcome to Escape from CSC109! Press enter when you are ready to start...");
        keyboardInput.nextLine();
        System.out.println("You are trapped in TATOR HALL!!!");
        start();
    }

    public static void start() {
        System.out.println("You find yourself in a large room with zoom carts on EVERY SINGLE WALL!! What would you like to do?\n1. Go left \n2. Go right \n3. Go up the stairs in front of you \n4. Go down for no reason");
        int input = keyboardInput.nextInt();
        if (input == 1) {
            moveLeft.goLeft();
        }
        else if (input == 2) {
            moveRight.goRight();
        }
        else if (input == 3) {
            goUp.moveUp();
        }
        else if (input == 4)
        {
            moveDown.goDown();
        }
    }

    public static void endCut(){
        System.out.println("HAHAHAHAHAHAHAHHAHAHAHAHAHAHAHHAHAHA");
        System.out.println("I knew you could'nt escape Alex's Class..... Its ... Not Possible.......");
        System.out.println("Wait a minute... Whatssss . . . Happening... You are being teleported!! to TH130... Its a LOOP SEQUENCE!!!!");
        start();
    }


    public static void main(String[] args) {
        new TextBasedAdventure().execute();
    }
}