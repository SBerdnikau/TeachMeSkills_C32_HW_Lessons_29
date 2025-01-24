package com.teachmeskills.lessons_29.dip.right.Impl;

import com.teachmeskills.lessons_29.dip.right.Connectable;

public class MongoDB implements Connectable {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }
}
