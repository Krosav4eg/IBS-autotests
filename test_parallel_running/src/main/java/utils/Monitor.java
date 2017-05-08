package utils;

/**
 * Created by Avic on 5/6/2017.
 */
public class Monitor {
    private static int count = 0;


    private Monitor() {
        System.out.println("Count monitor:" + ++count);
    }

    public static Monitor getMonitor() {
        return new Monitor();
    }
}
