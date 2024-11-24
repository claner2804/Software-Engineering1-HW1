package at.mci.claudiasteiner.vorbereitung6_Observer;


public class TemperaturDisplay implements Observer {

    private WeatherStation weatherStation;

    public TemperaturDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherStation.getTemperature();

        System.out.println("************************************ ");
        System.out.println("Der Temperatur Display wurde upgedatet: ");
        System.out.println("Aktuelle Temperatur: " + temperature + "°C");
        System.out.println("************************************ \n ");
    }
}
