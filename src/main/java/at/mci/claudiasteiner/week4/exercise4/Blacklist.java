package at.mci.claudiasteiner.week4.exercise4;

import java.util.HashSet;
import java.util.Set;

/**
 * The type Blacklist.
 */
public class Blacklist {

    /**
     * The Blacklist.
     */
    static Set<String> blacklist = new HashSet<>();

    /**
     * Instantiates a new Blacklist.
     */
    public Blacklist(){
        blacklist.add("www.blockedwebsite.com");
        blacklist.add("www.badsite.org");
        blacklist.add("www.unallowedcontent.com");
        blacklist.add("192.168.0.1");
        blacklist.add("10.0.0.1");
    }


    /**
     * Add.
     *
     * @param s the s
     */
    public void add(final String s) {
        blacklist.add(s);
    }

    /**
     * Remove.
     *
     * @param s the s
     */
    public void remove(final String s) {
        blacklist.remove(s);
    }

    /**
     * Is blocked boolean.
     *
     * @param s the s
     * @return the boolean
     */
    public static boolean isBlocked(final String s) {
        return blacklist.contains(s);
    }

}
