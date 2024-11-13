package at.mci.claudiasteiner.week3.exercise3;

public class Main {

    public static void main(String[] args) {

        // Verwende die Singleton-Instanz von Machine
        Machine machine = Machine.getInstance();

        // Jetzt die Methode dispenseDrink() auf der Instanz aufrufen
        machine.dispenseDrink();

    }
}
