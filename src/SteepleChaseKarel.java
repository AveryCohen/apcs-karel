import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class SteepleChaseKarel implements Directions {

    public static void main(String[] args) {
        //World.readWorld("worlds/hurdles2.kwld");
        //World.readWorld("worlds/hurdles.kwld");
        World.readWorld("worlds/hurdles3.kwld");


        World.setVisible(true);
        World.setDelay(100);

        SuperRobot bot = new SuperRobot(1, 1, East, 0);
    }

}
