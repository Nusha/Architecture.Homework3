package isp;

public class Main {
    public static void main(String[] args) {
        Worker robot = new RobotWorker();
        robot.work();

        HumanWorker human = new HumanWorker();
        human.eat();
        human.work();
    }
}
