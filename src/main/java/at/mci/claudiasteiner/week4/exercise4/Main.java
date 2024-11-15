package at.mci.claudiasteiner.week4.exercise4;


//creates an instance of ProxyInternet and attempts to connect to different URLs.
public class Main {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connectTo("www.google.com");

        internet.connectTo("www.blockedwebsite.com");

        internet.connectTo("192.168.0.1");


    }
}
