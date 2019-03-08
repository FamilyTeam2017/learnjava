package com.ma.designpatterns.observerpattern.case1;

public class WeatherStatiion {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditions(weatherData);
        new ForecastDisplay(weatherData);
        new ThirdPartyDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements("temp1", "humidity1","pressure1");
        weatherData.setMeasurements("temp2", "humidity2","pressure2");
        weatherData.setMeasurements("temp3", "humidity3","pressure3");
    }
}
