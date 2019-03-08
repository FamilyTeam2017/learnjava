package com.ma.designpatterns.observerpattern.case1;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Weather weather = new Weather();

    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData){
        this.weatherData =weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay:" + weather.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        weather = (Weather) arg;
        display();
    }
}
