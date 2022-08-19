package com.example.examnsc;

public class User {
    private String Username;
    private String Pass;

    public User(String user, String pass) {
        Username = user;
        Pass = pass;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "User='" + Username + '\'' +
                ", Pass='" + Pass + '\'' +
                '}';
    }

    public String getUser() {
        return Username;
    }

    public void setUser(String user) {
        Username = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }
}
