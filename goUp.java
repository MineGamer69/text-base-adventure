import java.util.Scanner;
public class goUp {
    public static void moveUp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You go up the stairs and are presented with three options... Do you: \n 1: Go down the slide to your left \n 2: Open the doors in front of you \n 3: Climb the ladder to your right");
        int option = scan.nextInt();
        scan.close();
        switch(option){
            case 1: System.out.println("You go down the slide, and it's a fun ride, until you fall into a pit of lava and die. Its not a fun ride");
            case 2: System.out.println("You open the doors in front of you and are met with a big room. You walk inside, and instantly get speared with a stone sword and die.");
            case 3: System.out.println("You climb the ladder to your right, and halfway up, the ladder breaks and you fall onto the slide. You slide on the slide until you fall into a pit of lava and die.");
        }
        youDied.Died();
    }
}