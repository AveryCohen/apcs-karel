import kareltherobot.UrRobot;


public class SuperRobot extends UrRobot {

    public SuperRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
