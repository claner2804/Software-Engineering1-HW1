package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class Bold extends TextDecorator {


    public Bold(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String show() {
        return "Bold " + super.show();
    }
}
