package at.mci.claudiasteiner.vorbereitung6_Observer;

public class Main {

    public static void main(String[] args) {

        // Erstellen einer WeatherStation-Instanz
        WeatherStation weatherStation = new WeatherStation();

        // Erstellen und Registrieren von Displays als Observer
        Display display = new Display(weatherStation);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherStation);
        TemperaturDisplay temperaturDisplay = new TemperaturDisplay(weatherStation);

        // Setzen der Wetterdaten und automatische Benachrichtigung der Observer
        weatherStation.setWeatherData(25.3f,65.0f,1014.1f);
        weatherStation.setWeatherData(1.0f,25.7f,1019.1f);

        // Entfernen des Statistik-Displays als Observer
        System.out.println("\n--- Entfernen des Statistik-Displays --- \n");
        weatherStation.removeObserver(statisticDisplay);

        // Setzen neuer Wetterdaten, um zu sehen, welche Observer aktualisiert werden
        weatherStation.setWeatherData(1.0f, 25.7f, 1019.1f);

    }
}
