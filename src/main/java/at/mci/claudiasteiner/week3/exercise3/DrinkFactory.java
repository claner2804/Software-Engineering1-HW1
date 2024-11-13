package at.mci.claudiasteiner.week3.exercise3;
import java.time.LocalTime;

public class DrinkFactory {

    public DrinkFactory() {
        System.out.println("DrinkFactory created");
    }

    // Factory-Methode zum Erstellen des richtigen Getränks basierend auf der Tageszeit
    public Drink createDrink(LocalTime currentTime) {
        int hour = currentTime.getHour();

        if (hour >= 6 && hour <= 15) {
            return new Coffee();
        } else if (hour >= 16 && hour < 21) {
            return new Tea();
        } else {
            return new Water();
        }
    }
}
