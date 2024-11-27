package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class TextDecorator implements Text {

    private Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }


    @Override
    public String show() {
        return decoratedText.show();
    }
}
