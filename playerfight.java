public class playerfight {

    public static void fight() {
        if (TextBasedAdventure.hasSword) {
            System.out.println("You defeat the giant with your sword and run out of the cave!");
        } else {
            System.out.println("You get stomped by the giant and red stuff goes everywhere.");
            youDied.Died();
            TextBasedAdventure.endCut();
        }
    }
    
}
