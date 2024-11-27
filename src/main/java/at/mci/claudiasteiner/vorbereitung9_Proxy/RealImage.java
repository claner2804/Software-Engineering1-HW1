package at.mci.claudiasteiner.vorbereitung9_Proxy;

// RealImage class
class RealImage implements Component {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Displaying image: " + fileName);
    }
}
