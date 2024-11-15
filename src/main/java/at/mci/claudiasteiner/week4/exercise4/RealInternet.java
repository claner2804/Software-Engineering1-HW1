package at.mci.claudiasteiner.week4.exercise4;

public class RealInternet implements Internet {

    //provide the actual connection functionality.
    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);
    }
}
