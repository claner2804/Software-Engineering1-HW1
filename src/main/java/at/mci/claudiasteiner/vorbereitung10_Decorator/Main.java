package at.mci.claudiasteiner.vorbereitung10_Decorator;

public class Main {
    public static void main(String[] args) {

        Text text = new SimpleText("Hello World");
        System.out.println(text.show());

        Text boldText = new Bold(text);
        System.out.println(boldText.show());

        Text italicText = new Italic(text);
        System.out.println(italicText.show());

        Text superText = new Italic(new Underlined(new Bold(text)));
        System.out.println(superText.show());


    }
}
