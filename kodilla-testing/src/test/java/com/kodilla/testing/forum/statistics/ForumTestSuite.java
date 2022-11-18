package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumTestSuite {
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
    @Mock
    private Statistics statisticsMock;

    private List<String> generateNames(int namesQuantity){
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= namesQuantity; i++){
            resultList.add("Name" + i);
        }
        return resultList;
    }
   @Nested
   @DisplayName("Test average posts per users")
    class testPostsPerUsers{

       @Test
       void testAveragePosts0Users0(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.postsCount()).thenReturn(0);
           when(statisticsMock.usersNames()).thenReturn(generateNames(0));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAveragePostsPerUsers();

           //Then
           assertEquals(0, result);
       }

       @Test
       void testAveragePosts1000Users0(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.postsCount()).thenReturn(1000);
           when(statisticsMock.usersNames()).thenReturn(generateNames(0));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAveragePostsPerUsers();

           //Then
           assertEquals(0, result);
       }

       @Test
       void testAveragePosts0Users100(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.postsCount()).thenReturn(0);
           when(statisticsMock.usersNames()).thenReturn(generateNames(100));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAveragePostsPerUsers();

           //Then
           assertEquals(0, result);
       }

       @Test
       void testAveragePosts1000Users100(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.postsCount()).thenReturn(1000);
           when(statisticsMock.usersNames()).thenReturn(generateNames(100));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAveragePostsPerUsers();

           //Then
           assertEquals(10, result);
       }

   }

   @Nested
   @DisplayName("Test average comments per users")
    class testCommentsPerUsers{

       @Test
       void testAverageComments0Users0(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(0);
           when(statisticsMock.usersNames()).thenReturn(generateNames(0));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerUsers();

           //Then
           assertEquals(0, result);
       }

       @Test
       void testAverageComments0Users100(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(0);
           when(statisticsMock.usersNames()).thenReturn(generateNames(100));

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerUsers();

           //Then
           assertEquals(0, result);
       }


   }
   @Nested
   @DisplayName("Test average comments per posts")


    class testCommentsPerPosts{

       @Test
       void testAverageComments0Posts0(){
          //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(0);
           when(statisticsMock.postsCount()).thenReturn(0);

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerPosts();

           //Then
           assertEquals(0, result);
       }

       @Test
       void testAverageComments0Posts100(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(0);
           when(statisticsMock.postsCount()).thenReturn(100);

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerPosts();

           //Then
           assertEquals(0, result);
       }
       @Test
       void testAverageCommentsMoreThanPosts(){

           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(250);
           when(statisticsMock.postsCount()).thenReturn(100);

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerPosts();

           //Then
           assertEquals(2.5, result);
       }


       @Test
       void testAveragePostsMoreThanComments(){
           //Given
           Forum forum = new Forum(statisticsMock);
           when(statisticsMock.commentsCount()).thenReturn(50);
           when(statisticsMock.postsCount()).thenReturn(100);

           //When
           forum.calculateAdvStatistics(statisticsMock);
           double result = forum.getAverageCommentsPerPosts();

           //Then
           assertEquals(0.5, result);
       }

   }


}
