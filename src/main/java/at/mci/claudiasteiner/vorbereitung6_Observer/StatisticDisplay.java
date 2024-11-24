package at.mci.claudiasteiner.vorbereitung6_Observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay implements Observer {

    private WeatherStation weatherStation;

    private List<Float> temperatures = new ArrayList<Float>();

    public StatisticDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {

        float currentTemperature = weatherStation.getTemperature();
        temperatures.add(currentTemperature);

        float maxTemperature = getMaxTemperature();
        float minTemperature = getMinTemperature();
        float averageTemperature = getAverageTemperature();

        System.out.println("************************************ ");
        System.out.println("Der Statistische Display wurde upgedatet: ");
        System.out.println("Aktuelle Temperatur: " + currentTemperature + "°C");
        System.out.println("Durchschnittliche Temperatur: " + averageTemperature + "°C");
        System.out.println("Maximale Temperatur: " + maxTemperature + "°C");
        System.out.println("Minimale Temperatur: " + minTemperature + "°C");
        System.out.println("************************************ \n ");
    }


    private float getMaxTemperature() {
        float maxTemperature = Float.MIN_VALUE;
        for (Float temperature : temperatures) {
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }
        return maxTemperature;
    }


    private float getMinTemperature() {
        float minTemperature = Float.MAX_VALUE;
        for (Float temperature : temperatures) {
            if (temperature < minTemperature) {
                minTemperature = temperature;
            }
        }
        return minTemperature;
    }

    private float getAverageTemperature() {
        float averageTemperature = 0;
        for (Float temperature : temperatures) {
            averageTemperature += temperature;
        }
        return averageTemperature / temperatures.size();
    }



}
