package at.mci.claudiasteiner.week4.exercise1;

//Exersice one is not mandatory.
//Here I coded with a YouTube tutorial to understand the composite Pattern better

//Leaf
// Das ist die einfachste Einheit der Baumstruktur,
// z.B. eine Datei im Dateisystem. Leaf hat keine
// untergeordneten Elemente. Es implementiert die
// Component-Schnittstelle.


/**
 * The type File.
 */
public class File implements FileSystemElement {
    private String name;

    /**
     * Instantiates a new File.
     *
     * @param name the name
     */
    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
