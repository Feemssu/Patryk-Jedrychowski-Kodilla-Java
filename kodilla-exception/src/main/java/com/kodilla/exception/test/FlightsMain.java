package com.kodilla.exception.test;

public class FlightsMain {
    public static void main(String[] args){

        FindFlights findFlights = new FindFlights();
        Flight flight = new Flight("KRK","POZ"); //error
        Flight flight2 = new Flight("KRK","KRK"); //error
        Flight flight3 = new Flight("KRK", "WWA"); //work

        try{
            findFlights.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no route " + e);
        } finally {
            System.out.println("Thank you for using.");
        }
    }
}
