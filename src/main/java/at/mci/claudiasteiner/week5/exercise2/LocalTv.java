package at.mci.claudiasteiner.week5.exercise2;

public class LocalTv implements Observer {

    private String name;

    public LocalTv(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Der lokale Tv-Sender " + name + " wurde mit den neuesten Nachrichten upgedatet!");
    }
}
