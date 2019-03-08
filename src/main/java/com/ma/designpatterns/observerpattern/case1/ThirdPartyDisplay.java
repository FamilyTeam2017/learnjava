package com.ma.designpatterns.observerpattern.case1;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement{

    private Weather weather;

    private Observable weatherData;

    public ThirdPartyDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ThirdParty:"+ weather.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        weather = (Weather) arg;
        display();
    }
}
