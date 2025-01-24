package com.teachmeskills.lessons_29.dip.right.service;

import com.teachmeskills.lessons_29.dip.right.Connectable;

public class UserService {
    private final Connectable databaseConnect;

    public UserService(Connectable databaseConnect) {
        this.databaseConnect = databaseConnect;
    }

    public Connectable getConnect() {
        return databaseConnect;
    }

}
