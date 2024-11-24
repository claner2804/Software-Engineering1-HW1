package at.mci.claudiasteiner.vorbereitung6_Observer;

public class Display implements Observer {

    private WeatherStation weatherStation;

    // Konstruktor zur Initialisierung der WeatherStation und Registrierung des Displays als Observer
    public Display(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }


    // Die `update()` Methode wird aufgerufen, wenn die WeatherStation Änderungen meldet
    @Override
    public void update() {
        float temperature = weatherStation.getTemperature();
        float humidity = weatherStation.getHumidity();
        float pressure = weatherStation.getPressure();

        // Ausgabe der aktuellen Wetterdaten
        System.out.println("************************************ ");
        System.out.println("Der Allgemeine Display wurde upgedatet: ");
        System.out.println("Aktuelle Temperatur: " + temperature + "°C");
        System.out.println("Luftfeuchtigkeit: " + humidity + "%");
        System.out.println("Luftdruck: " + pressure + " hPa");
        System.out.println("************************************ \n ");
    }
}
