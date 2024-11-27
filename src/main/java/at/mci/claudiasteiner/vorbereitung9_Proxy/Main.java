package at.mci.claudiasteiner.vorbereitung9_Proxy;


// Main class
public class Main {
    public static void main(String[] args) {
        Component image = new ProxyImage("largeImage.jpg");

        // The image is loaded only during the first call to display()
        System.out.println("First call to display():");
        image.show();

        // The image is already loaded, so it is displayed directly
        System.out.println("\nSecond call to display():");
        image.show();
    }
}