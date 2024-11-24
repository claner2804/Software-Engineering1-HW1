package at.mci.claudiasteiner.week5.exercise2;

public class Newspaper implements Observer {

    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Die Lokale Zeitung " + name + " wurde mit den neuesten Nachrichten upgedatet!");
    }
}
