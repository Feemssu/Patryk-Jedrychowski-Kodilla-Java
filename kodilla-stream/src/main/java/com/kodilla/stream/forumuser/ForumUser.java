package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String nick;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsNumber;

    public ForumUser(final int userID, final String nick, final char sex, final LocalDate dateOfBirth, final int postsNumber) {
        this.userID = userID;
        this.nick = nick;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getNick() {
        return nick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString(){
        return "User: " +
                "UserID: " + userID + '\'' +
                ", Nick: " + nick + '\'' +
                ", Sex: " +  sex + '\'' +
                ", Date of Birth: " + dateOfBirth + '\'' +
                ", Posts number: " + postsNumber;
    }
}
