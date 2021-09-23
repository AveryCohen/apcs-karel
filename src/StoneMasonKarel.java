import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class StoneMasonKarel implements Directions {

    public static void main(String[] args) {
        World.readWorld("worlds/stoneMason.kwld");
        //World.readWorld("worlds/sampleStone1.kwld");
        //World.readWorld("worlds/sampleStone2.kwld");

        World.setVisible(true);
        World.setDelay(100);

        UrRobot bot = new UrRobot(1, 1, East, 100);
    }
}
