package com.ma.designpatterns.observerpattern.case1;
/**
 * 天气相关数据
 */
public class Weather{
    /**
     * 温度
     */
    private String temperature;

    /**
     * 湿度
     */
    private String humidity;

    /**
     * 气压
     */
    private String barometricPressure;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getBarometricPressure() {
        return barometricPressure;
    }

    public void setBarometricPressure(String barometricPressure) {
        this.barometricPressure = barometricPressure;
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        buffer.append("\"temperature\":");
        buffer.append(temperature);
        buffer.append(",");
        buffer.append("\"humidity\":");
        buffer.append(humidity);
        buffer.append(",");
        buffer.append("\"pressure\":");
        buffer.append(barometricPressure);
        buffer.append("}");
        return buffer.toString();
    }
}