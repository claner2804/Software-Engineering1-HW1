package at.mci.claudiasteiner.vorbereitung5;

import java.util.List;
import java.util.ArrayList;

public class Logger {

    List logs = new ArrayList();

    // Singleton Pattern
    private static Logger instance = null;


    // private Constructor
    private Logger(){
        logs = new ArrayList();
        System.out.println("Logger created");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
            System.out.println("Logger Instance started");
        } else {
            System.out.println("Logger already started. Only one can run at a time.");
        }
        return instance;
    }


    public void log(String msg){
        //Alle Protokollnachrichten sollen in einer Liste gespeichert werden.
        logs.add(msg);
    }

    public void printLogs(){
        for (Object log : logs) {
            System.out.println(log);
        }

    }


}
