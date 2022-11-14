package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateMean(){
        double temp = 0;
        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            temp = temp + entry.getValue();
        }
        int size = temperatures.getTemperatures().size();
        return temp / size;
    }

    public double calculateMedian(){

        List<Double> medianTemp = new ArrayList<>();
        for(Map.Entry<String, Double> temperature:
        temperatures.getTemperatures().entrySet()){
            medianTemp.add(temperature.getValue());
        }
        Collections.sort(medianTemp);

        double medianValue = 0;
        if(medianTemp.size() % 2 == 0){
            medianValue = (medianTemp.get(medianTemp.size()/2) + medianTemp.get((medianTemp.size()/2)-1))/2;

        }else{
            medianValue = medianTemp.get((medianTemp.size())/2);
        }
        return medianValue;
    }


}