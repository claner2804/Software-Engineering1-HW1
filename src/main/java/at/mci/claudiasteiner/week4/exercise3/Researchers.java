package at.mci.claudiasteiner.week4.exercise3;


//Composite:

//Die Composite-Klasse ist eine Klasse, die mehrere Komponenten
// (also Leafs oder andere Composites) enthalten
// kann. Sie stellt eine Art Container für
// untergeordnete Komponenten dar.


public class Researchers extends EmployeeGroup {

    public Researchers(String name) {

        //super(name); ruft den Konstruktor der Superklasse auf und übergibt
        // ihm den Parameter name. Dadurch wird sichergestellt, dass die
        // Basisklasse (EmployeeGroup) korrekt initialisiert wird, indem der Name
        // der Gruppe gesetzt wird. Das hilft, redundanten Code zu vermeiden
        // und die Vererbung sinnvoll zu nutzen.
        super(name);
    }
}
