package hw5.Timer;

public class TimePrint implements IAction {

    @Override
    public void action() {
        while (true) {
            System.out.println("10 seconds have passed");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}