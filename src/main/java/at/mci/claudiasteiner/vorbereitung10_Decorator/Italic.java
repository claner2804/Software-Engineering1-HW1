package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class Italic extends TextDecorator {


    public Italic(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String show() {
        return "Italic " + super.show();
    }
}
