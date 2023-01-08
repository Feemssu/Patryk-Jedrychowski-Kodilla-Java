package com.kodilla.good.patterns.challenges.orderservice;

public class MailService implements InformationService{

    public void info(final User user){
        System.out.println("Sending email to user: " + user.getName() + " " + user.getSurname());
    }
}
