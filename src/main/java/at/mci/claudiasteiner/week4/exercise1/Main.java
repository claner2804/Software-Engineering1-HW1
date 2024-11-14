package at.mci.claudiasteiner.week4.exercise1;


//Exersice one is not mandatory.
//Here I coded with a YouTube tutorial to understand the composite Pattern better

//Grundidee des Composite Patterns
//ein Verzeichnis in einem Dateisystem:
//Ein Verzeichnis kann Dateien enthalten,
// aber auch weitere Unterverzeichnisse.
//Unterverzeichnisse können ebenfalls Dateien
// oder weitere Unterverzeichnisse enthalten.



// Client
// Der Client arbeitet nur mit Component-Objekten.
// Da sowohl Leaf als auch Composite die
// Component-Schnittstelle implementieren,
// muss der Client nicht wissen, ob er mit einem
// Leaf oder einem Composite arbeitet –
// das macht den Code flexibel und einfach.

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("Folder1");
        folder1.addElement(file1);
        folder1.addElement(file2);

        Folder mainFolder = new Folder("MainFolder");
        mainFolder.addElement(folder1);
        mainFolder.addElement(new File("file3.txt"));

        mainFolder.showDetails();


        //Wenn wir die Methode showDetails() auf MainFolder aufrufen, passiert Folgendes:

        //Die erste Zeile der Methode gibt "Folder: MainFolder" aus.
        //Dann geht die Schleife durch die Elemente von MainFolder:
        //Das erste Element ist Folder1.
        //Die Methode showDetails() wird für Folder1 aufgerufen.
        //"Folder: Folder1" wird ausgegeben.
        //Die Schleife geht durch die Elemente von Folder1:
        //file1.txt: "File: file1.txt" wird ausgegeben.
        //file2.txt: "File: file2.txt" wird ausgegeben.
        //Das nächste Element ist file3.txt.
        //Die Methode showDetails() wird für file3.txt aufgerufen.
        //"File: file3.txt" wird ausgegeben.





    }
}
