package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Tests are starting");
    }
    @AfterAll
            public static void afterAllTests(){
        System.out.println("Tests are finished");
    }
    Map<String, Double> temperaturesMap = new HashMap<>();
    @BeforeEach
    public void beforeEveryTests() {
        testCounter++;
        System.out.println("test: " + testCounter);
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

    }
    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMean() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMean();
        //Then
        Assertions.assertEquals(25.56, result);
    }

    @Test
    void testMedianTemperaturesOdd() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.5, result);
    }

    @Test
    void testMedianTemperaturesEven() {
        //Given
        temperaturesMap.remove("Gdansk");

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedian();


        //Then
        Assertions.assertEquals(25.35, result);
        temperaturesMap.put("Gdansk", 26.1);
    }
}