package at.mci.claudiasteiner.week3.exercise3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Machine {

    private LocalTime currentTime;  // Zum Speichern der aktuellen Uhrzeit

    // Singleton Pattern
    private static Machine instance = null;
    private DrinkFactory drinkFactory;


    // private Constructor
    private Machine(){
        this.drinkFactory = new DrinkFactory();
        currentTime = LocalTime.now();
        System.out.println("Machine created with current time: " + currentTime);
    }

    public static Machine getInstance(){
        if(instance == null){
            instance = new Machine();
            System.out.println("Machine Instance started");
        } else {
            System.out.println("Machine already started. Only one can run at a time.");
        }
        return instance;
    }


    // Die Factory-Methode createDrink entscheidet, basierend auf der aktuellen Uhrzeit (currentTime),
    // welches Getränk erzeugt werden soll
    public  void dispenseDrink() {
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm"));  // Nur Stunden und Minuten
        Drink drink = drinkFactory.createDrink(currentTime);
        System.out.println("************************");
        System.out.println("Someone is thirsty! Let's see what time it is...");
        System.out.println("The Time is " + formattedTime + ". Dispensing: " + drink.getName());
        System.out.println("************************");;
    }

}
