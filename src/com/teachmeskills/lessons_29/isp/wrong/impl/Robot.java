package com.teachmeskills.lessons_29.isp.wrong.impl;

import com.teachmeskills.lessons_29.isp.wrong.Worker;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("robot is not eat");
    }
}
