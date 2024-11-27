package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class Underlined extends TextDecorator {


    public Underlined(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String show() {
        return "Underlined " + super.show();
    }
}