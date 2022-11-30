package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlights {

    public Map<String, Boolean> airPorts() {
        Map<String, Boolean> result = new HashMap<>();
        result.put("KRK", true);
        result.put("WWA", true);
        result.put("POZ", false);
        result.put("WRO", false);
        return result;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        } else if (airPorts().containsKey(flight.getArrivalAirport()) && airPorts().containsKey(flight.getDepartureAirport())
                && airPorts().get(flight.getArrivalAirport())) {
            System.out.println("You can flight to " + flight.getArrivalAirport() + " from " + flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}

