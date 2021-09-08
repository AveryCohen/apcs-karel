import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class ShelfStocker implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/shelf.kwld");
        World.setVisible(true);
        World.setDelay(75);
        //World.showSpeedControl(true);

        int row = 1;
        int col = 1;
        AveryBot bot = new AveryBot(row, col,
                North, 1);
        bot.turnRight();

    }
}
