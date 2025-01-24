package com.teachmeskills.lessons_29.isp.right.Impl;

import com.teachmeskills.lessons_29.isp.right.Workable;

public class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}
