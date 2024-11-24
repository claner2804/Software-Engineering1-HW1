package at.mci.claudiasteiner.vorbereitung6_Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    // Wetterdaten, die als Zustände des Subjects dienen
    private float temperature;
    private float humidity;
    private float pressure;

    // Liste von Observern, die über Änderungen benachrichtigt werden sollen
    private List<Observer> observers = new ArrayList<Observer>();


    // Methode zum Hinzufügen eines neuen Observers (z.B. Displays)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Methode zum Entfernen eines bestehenden Observers
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    // Methode zum Benachrichtigen aller Observer über Änderungen
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Setzen der Wetterdaten und automatische Benachrichtigung aller Observer
    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // Benachrichtigt alle Observer nach dem Setzen der Daten
    }


    // Getter-Methoden, damit Observer die aktuellen Zustände abrufen können
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }



}
