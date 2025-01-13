package com.example.weatherdashboard.model;

import lombok.Data;

@Data
public class WeatherData {
    private Main main;
    private Weather[] weather;
    private String name;

    @Data
    public static class Main {
        private double temp;
        private double feels_like;
        private double humidity;
    }

    @Data
    public static class Weather {
        private String main;
        private String description;
    }
} 