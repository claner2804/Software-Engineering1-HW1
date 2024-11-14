package at.mci.claudiasteiner.week4.exercise1;

import java.util.ArrayList;
import java.util.List;

//Exersice one is not mandatory.
//Here I coded with a YouTube tutorial to understand the composite Pattern better


//Composite:

//Die Composite-Klasse ist eine Klasse, die mehrere Komponenten
// (also Leafs oder andere Composites) enthalten
// kann. Sie stellt eine Art Container für
// untergeordnete Komponenten dar.
//In deinem Beispiel wäre die Folder-Klasse
// ein Composite. Ein Folder kann Dateien (Leafs)
// und weitere Ordner (andere Composite-Objekte) enthalten.
//Folder implementiert ebenfalls die
// FileSystemElement-Schnittstelle, sodass es wie
// ein einzelnes Element behandelt werden kann,
// enthält jedoch zusätzliche Methoden zur
// Verwaltung von Kindern wie add(FileSystemElement
// element) oder remove(FileSystemElement element).

/**
 * The type Folder.
 */
public class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<FileSystemElement>();

    /**
     * Instantiates a new Folder.
     *
     * @param name the name
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Add element.
     *
     * @param element the element
     */
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public void showDetails() {
        // Ausgabe des aktuellen Ordnernamens
        System.out.println("Folder: " + name);

        // Für jedes Element im Ordner (entweder Datei oder Unterordner)
        for (FileSystemElement element : elements) {
            // Zeige die Details des Elements an
            // (Wenn das Element ein weiterer Ordner ist, wird diese Methode wieder aufgerufen)
            element.showDetails();
        }
    }

}
