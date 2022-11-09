package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addTry = calculator.add(2,3);
        int subtractTry = calculator.subtract(5,1);

        if(addTry == 5) {
            System.out.println("add test OK");
        } else {
            System.out.println("add test Error");
        }

        if(subtractTry == 4) {
            System.out.println("subtract test OK");
        } else {
            System.out.println("subtract test Error");
        }
    }
}
