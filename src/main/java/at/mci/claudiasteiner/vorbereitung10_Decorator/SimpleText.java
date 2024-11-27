package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class SimpleText implements Text {

    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String show() {
        return text;
    }
}
