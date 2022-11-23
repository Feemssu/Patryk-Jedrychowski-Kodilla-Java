package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        double result = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            result = result + numbers[i];
        }

        //When
        double average = getAverage(numbers);
        result = result/numbers.length;

        //Then
        assertEquals(result, average);
    }

}
