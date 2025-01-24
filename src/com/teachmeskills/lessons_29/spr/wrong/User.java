package com.teachmeskills.lessons_29.spr.wrong;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser(){
        System.out.println("Connecting to MySQL..");
        System.out.println("Saving  " + name);
        System.out.println("Done");
    }

    public void sendEmail(){
        System.out.println("Connecting to MySQL...");
        System.out.println("Send massage to " + email);
        System.out.println("Done");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
