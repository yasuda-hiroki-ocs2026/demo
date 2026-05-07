// src/main/java/com/example/demo/model/Answer.java
package com.example.demo.model;

public class Answer {

    private String region;
    private int month;
    private String weatherType;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }
}