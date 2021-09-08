import kareltherobot.UrRobot;

public class AveryBot extends UrRobot {
    public AveryBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
