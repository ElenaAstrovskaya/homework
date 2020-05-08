package hw5.Timer;

public class Timer {

    IAction act;

    public Timer(IAction act) {
        this.act = act;
    }

    public void run() {
        act.action();
    }
}