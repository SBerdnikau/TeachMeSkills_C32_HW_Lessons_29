package com.teachmeskills.lessons_29.lsp.wrong;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich don't fly");
    }
}
