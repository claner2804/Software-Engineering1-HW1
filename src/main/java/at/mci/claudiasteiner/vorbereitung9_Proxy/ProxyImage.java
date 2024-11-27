package at.mci.claudiasteiner.vorbereitung9_Proxy;

// ProxyImage class
class ProxyImage implements Component {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.show();
    }
}
