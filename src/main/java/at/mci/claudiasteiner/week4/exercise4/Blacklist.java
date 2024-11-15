package at.mci.claudiasteiner.week4.exercise4;

import java.util.HashSet;
import java.util.Set;

public class Blacklist {

    static Set<String> blacklist = new HashSet<>();

    public Blacklist(){
        blacklist.add("www.blockedwebsite.com");
        blacklist.add("www.badsite.org");
        blacklist.add("www.unallowedcontent.com");
        blacklist.add("192.168.0.1");
        blacklist.add("10.0.0.1");
    }


    public void add(final String s) {
        blacklist.add(s);
    }

    public void remove(final String s) {
        blacklist.remove(s);
    }

    public static boolean isBlocked(final String s) {
        return blacklist.contains(s);
    }

}
