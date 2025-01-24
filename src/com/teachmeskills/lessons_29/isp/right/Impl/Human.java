package com.teachmeskills.lessons_29.isp.right.Impl;

import com.teachmeskills.lessons_29.isp.right.Eatable;
import com.teachmeskills.lessons_29.isp.right.Workable;

public class Human implements Workable, Eatable {
    @Override
    public void eat() {
        System.out.println("Human is eat");
    }

    @Override
    public void work() {
        System.out.println("Human is working...");
    }
}
