package com.ma.designpatterns.observerpattern.case1;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

    private Weather weather = new Weather();

    private Observable weatherData;

    public ForecastDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        //display forecast
        System.out.println("ForecastDisplay:" + weather.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        weather = (Weather) arg;
        display();
    }
}
