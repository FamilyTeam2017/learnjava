package com.ma.designpatterns.observerpattern.case1;

import java.util.Observable;

/**
 * 气象
 */
public class WeatherData extends Observable {

    private Weather weather = new Weather();


    public void setMeasurements(String temperature, String humidity, String pressure){
        weather.setTemperature(temperature);
        weather.setHumidity(humidity);
        weather.setBarometricPressure(pressure);
        measurementsChanged();
    }

    /**
     * 通知其他方数据,只要上面的数据变动,就出发该方法,通知其他机构
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers(weather);
    }

}
