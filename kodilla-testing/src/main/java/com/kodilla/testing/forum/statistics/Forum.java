package com.kodilla.testing.forum.statistics;

public class Forum {

    private Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUsers;
    private double averageCommentsPerUsers;
    private double averageCommentsPerPosts;

    public Statistics getStatistics() {
        return statistics;
    }
    public void showStatistics(){
        System.out.println(toString());
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUsers() {
        return averagePostsPerUsers;
    }

    public double getAverageCommentsPerUsers() {
        return averageCommentsPerUsers;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public Forum(Statistics statistics){
        this.statistics = statistics;
    }
    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(usersCount > 0) {
            averagePostsPerUsers = (double) postsCount / (double) usersCount;
        }else{
            averagePostsPerUsers = 0;
        }

        if (usersCount > 0){
            averageCommentsPerUsers= (double) commentsCount/(double) usersCount;
        }else {
            averageCommentsPerUsers = 0;
        }

        if (postsCount > 0){
            averageCommentsPerPosts = (double) commentsCount/(double) postsCount;
        }else{
            averageCommentsPerPosts = 0;
        }

    }
    public String toString(){
        return "Statistics:" +
                "Users: " + usersCount +
                "Posts: " + postsCount +
                "Comments: " + commentsCount +
                "Average posts per users: " + averagePostsPerUsers +
                "Average comments per users: " + averageCommentsPerUsers +
                "Average comments per posts: " + averageCommentsPerPosts;

        }
    }
