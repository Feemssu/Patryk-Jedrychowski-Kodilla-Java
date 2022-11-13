package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Tests are starting");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to test #" + testCounter);
    }

    @Nested
    @DisplayName("Add and remove tests")
    class AddAndRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeElement = new ShapeCollector();
            Square square = new Square(5);
            //When
            shapeElement.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeElement.getFigureQuantity());

        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeElement = new ShapeCollector();
            Circle circle = new Circle(5);
            shapeElement.addFigure(circle);

            //When
            boolean result = shapeElement.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeElement.getFigureQuantity());
        }
    }

    @Nested
    @DisplayName("Get and show test")
    class GetAndShow {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeElement = new ShapeCollector();
            Triangle triangle = new Triangle(5, 2);
            shapeElement.addFigure(triangle);

            //When
            Shape getTriangle;
            getTriangle = shapeElement.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, getTriangle);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeElement = new ShapeCollector();
            Square square = new Square(5);
            shapeElement.addFigure(square);

            //When
            String result = shapeElement.showFigure();

            //Then
            Assertions.assertEquals("Square", result);

        }
    }
}