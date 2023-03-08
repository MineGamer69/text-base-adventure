public class moveRight {
    public static void goRight() {
        if (!TextBasedAdventure.hasSword) {
            System.out.println("You find a sword on the ground!");
            TextBasedAdventure.hasSword = true;
        }
        else {
            TreasureChest.chestFound();
            TextBasedAdventure.endCut();
        }
        TextBasedAdventure.start();
    }
}
