package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("create OddNumbersExterminator with empty array list")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator tryList = new OddNumbersExterminator();
        List<Integer> listTest = tryList.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList,listTest);
    }

    @DisplayName("create OddNumbersExterminator with even and odd numbers")

    @Test
     void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = List.of(1,2,3,4 ,5,6,11,22);
        //When
        OddNumbersExterminator tryList = new OddNumbersExterminator();
        List<Integer> listTest =  tryList.exterminate(normalList);
        List<Integer> expectedListTest = List.of(2,4,6,22);
        System.out.println("Testing list: " + normalList);
        //Then
        Assertions.assertEquals(listTest, expectedListTest);
    }
}
