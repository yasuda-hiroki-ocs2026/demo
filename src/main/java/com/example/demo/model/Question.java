
package com.example.demo.model;

public class Question {

    private String region;
    private int month;
    private String weatherType;

    private double temperature;
    private double rainfall;
    private double sunshine;

    private String hint;

    public Question(
            String region,
            int month,
            String weatherType,
            double temperature,
            double rainfall,
            double sunshine,
            String hint
    ) {
        this.region = region;
        this.month = month;
        this.weatherType = weatherType;
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.sunshine = sunshine;
        this.hint = hint;
    }

    public String getRegion() {
        return region;
    }

    public int getMonth() {
        return month;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRainfall() {
        return rainfall;
    }

    public double getSunshine() {
        return sunshine;
    }

    public String getHint() {
        return hint;
    }
}