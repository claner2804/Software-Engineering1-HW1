package at.mci.claudiasteiner.week4.exercise1;

//Exersice one is not mandatory.
//Here I coded with a YouTube tutorial to understand the composite Pattern better


//Component
//Dies ist die Basisklasse (oft eine Schnittstelle
// oder abstrakte Klasse), die sowohl von Blättern
// als auch von Kompositen verwendet wird.
// Sie definiert eine gemeinsame Schnittstelle für
// alle Komponenten in der Baumstruktur. Das ist wichtig,
// um Einzelkomponenten und Gruppen von Komponenten
// auf dieselbe Weise behandeln zu können.

/**
 * The interface File system element.
 */
public interface FileSystemElement {
    /**
     * Show details.
     */
    void showDetails();
}
