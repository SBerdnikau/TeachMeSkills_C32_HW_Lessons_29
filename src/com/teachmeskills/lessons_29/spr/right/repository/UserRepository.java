package com.teachmeskills.lessons_29.spr.right.repository;

import com.teachmeskills.lessons_29.spr.right.model.User;

public class UserRepository {
    public void saveUser(User user){
        System.out.println("Connecting to MySQL..");
        System.out.println("Saving  " + user.getName());
        System.out.println("Done");
    }
}
