package com.example.weatherdashboard.service;

import com.example.weatherdashboard.model.WeatherData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    void getWeatherForCity_ShouldReturnWeatherData() {
        // Arrange
        WeatherData mockWeatherData = new WeatherData();
        when(restTemplate.getForObject(any(String.class), eq(WeatherData.class), any(Object[].class)))
            .thenReturn(mockWeatherData);

        // Act
        WeatherData result = weatherService.getWeatherForCity("London");

        // Assert
        assertNotNull(result);
    }
} 