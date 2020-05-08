package hw5.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(new TimePrint());

        boolean times = true;
        while(times){
            timer.run();
        }
    }
}