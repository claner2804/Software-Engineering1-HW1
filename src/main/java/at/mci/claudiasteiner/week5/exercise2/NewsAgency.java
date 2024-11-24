package at.mci.claudiasteiner.week5.exercise2;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    //Was macht die observers-Liste?
    //Die observers-Liste enthält alle Clients,
    // die sich bei der Nachrichtenagentur registriert
    // haben und auf Updates warten, wenn neue Nachrichten
    // veröffentlicht werden. Hier ist, was diese Liste
    // macht:
    //
    //Observer registrieren: Wenn ein Client (z.B. eine Zeitung) bei der NewsAgency angemeldet werden möchte, fügen wir ihn zur observers-Liste hinzu.
    //Benachrichtigen: Wenn es neue Nachrichten gibt, durchläuft die NewsAgency die Liste observers und benachrichtigt alle registrierten Observer, damit diese die neuesten Nachrichten erhalten.
    private List<Observer> observers = new ArrayList<Observer>();


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
