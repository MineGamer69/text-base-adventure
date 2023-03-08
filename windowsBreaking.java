import java.util.Scanner;
public class windowsBreaking {
    public static void brokenWindows(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The windows are breaking... What are you gonna do: \n 1: Run out the door \n 2: Duck under the table");
        System.out.println("Enter in a number as your decision");
        int option = scanner.nextInt();
        switch(option){
            case 1: System.out.println("The evil monster got you");
            case 2: System.out.println("You are safe. Run to the library");
        }
    }
}