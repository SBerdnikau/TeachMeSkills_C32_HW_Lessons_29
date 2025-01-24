package com.teachmeskills.lessons_29.spr.right.service;

import com.teachmeskills.lessons_29.spr.right.model.User;

public class EmailService {
    public void sendEmail(User user){
        System.out.println("Connecting to MySQL...");
        System.out.println("Send massage to " + user.getEmail());
        System.out.println("Done");
    }
}
