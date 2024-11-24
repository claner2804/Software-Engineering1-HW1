package at.mci.claudiasteiner.vorbereitung6_Observer;


// Observer Interface, das alle Observer implementieren müssen
// Hierdurch wird sichergestellt, dass alle Observer eine `update()`-Methode
// haben, um bei Änderungen reagieren zu können.
public interface Observer {
    void update();
}
