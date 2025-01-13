package com.example.weatherdashboard.service;

import com.example.weatherdashboard.model.WeatherData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid={apiKey}";

    public WeatherService(RestTemplate restTemplate, @Value("${openweathermap.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public WeatherData getWeatherForCity(String city) {
        return restTemplate.getForObject(API_URL, WeatherData.class, city, apiKey);
    }
} 