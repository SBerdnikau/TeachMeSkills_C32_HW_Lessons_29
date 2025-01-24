package com.teachmeskills.lessons_29.dip.right.Impl;

import com.teachmeskills.lessons_29.dip.right.Connectable;

public class MySQLDatabase implements Connectable {
    @Override
    public void connect() {
        System.out.println("Connecting to MYSQL");
    }
}
