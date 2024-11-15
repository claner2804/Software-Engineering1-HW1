package at.mci.claudiasteiner.week4.exercise4;


/**
 * The type Main.
 */
//creates an instance of ProxyInternet and attempts to connect to different URLs.
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connectTo("www.google.com");

        internet.connectTo("www.blockedwebsite.com");

        internet.connectTo("192.168.0.1");


    }
}
