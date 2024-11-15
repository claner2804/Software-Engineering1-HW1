package at.mci.claudiasteiner.week4.exercise4;

// should include logic to check URLs against a blacklist and decide whether to forward the request to RealInternet or deny it.
public class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();
    private Blacklist blacklist = new Blacklist();

    //This is where you can add the filtering functionality to check against a blacklist of URLs or IP addresses. If the URL is on the blacklist, you can prevent the connection.
    @Override
    public void connectTo(String host){
        if (host == null || host.isEmpty()){
            System.out.println("Host is null or empty");
        } else if (Blacklist.isBlocked(host)) {
            System.out.println("Host " + host + " is blocked");
        } else {
            realInternet.connectTo(host);
        }
    }

}
