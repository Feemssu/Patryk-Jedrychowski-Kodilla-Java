package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        // Given
        // Create europe with countries
        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal("123456789"));
        Country france = new Country(new BigDecimal("9502390542"));
        Country italy = new Country(new BigDecimal("312423153215"));

        // Create asia with countries
        Continent asia = new Continent();
        Country china = new Country(new BigDecimal("1543643231"));
        Country india = new Country(new BigDecimal("210948913"));
        Country japan = new Country(new BigDecimal("5433211"));

        //Create america with countries
        Continent america = new Continent();
        Country mexico = new Country(new BigDecimal("231415513"));
        Country usa = new Country(new BigDecimal("214351315"));
        Country canada = new Country(new BigDecimal("952821"));

        //Create world
        World world = new World();

        //When
        //Create relations for europe
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(italy);

        //Create relations for asia
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        //Create relations for america
        america.addCountry(mexico);
        america.addCountry(usa);
        america.addCountry(canada);

        //Create relations for world
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        //Create countrylist
        List<Country> countryList = new ArrayList<>();
        countryList.add(poland);
        countryList.add(france);
        countryList.add(italy);
        countryList.add(mexico);
        countryList.add(usa);
        countryList.add(canada);
        countryList.add(china);
        countryList.add(india);
        countryList.add(japan);


        BigDecimal worldQuantity = BigDecimal.ZERO;
        for (Country peopleQuantity: countryList) {
            worldQuantity = worldQuantity.add(peopleQuantity.getPeopleQuantity());
        }
        BigDecimal worldGetPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(worldQuantity, worldGetPeopleQuantity);

    }
}
