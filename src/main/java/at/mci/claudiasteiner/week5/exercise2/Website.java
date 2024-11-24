package at.mci.claudiasteiner.week5.exercise2;

public class Website implements Observer {

    private String name;

    public Website(String name) {
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println("Die Website " + name + " wurde mit den neuesten Nachrichten upgedatet!");
    }
}
