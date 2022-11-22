package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList= new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(0001, "ForumNick001", 'M',
                LocalDate.of(1994,10,02), 0));

        userList.add(new ForumUser(0002, "ForumNick002", 'F',
                LocalDate.of(2001,03,12), 111));

        userList.add(new ForumUser(0003, "ForumNick003", 'M',
                LocalDate.of(1987,11,21), 456));

        userList.add(new ForumUser(0004, "ForumNick004", 'M',
                LocalDate.of(1992,12,9), 230));

        userList.add(new ForumUser(0005, "ForumNick005", 'F',
                LocalDate.of(1997,9,11), 106));

        userList.add(new ForumUser(0006, "ForumNick006", 'M',
                LocalDate.of(2011,07,23), 43));

        userList.add(new ForumUser(0007, "ForumNick007", 'F',
                LocalDate.of(2005,01,27), 0));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
